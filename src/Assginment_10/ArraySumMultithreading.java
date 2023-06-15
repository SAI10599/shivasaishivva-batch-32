package Assginment_10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class PartialSumCalculator implements Runnable {
    private final int[] array;
    private final int startIndex;
    private final int endIndex;
    private int partialSum;

    public PartialSumCalculator(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.partialSum = 0;
    }

    public int getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            partialSum += array[i];
        }
    }
}

public class ArraySumMultithreading {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        int threadsCount = 5;
        int elementsPerThread = array.length / threadsCount;

        ExecutorService executor = Executors.newFixedThreadPool(threadsCount);
        PartialSumCalculator[] calculators = new PartialSumCalculator[threadsCount];


        for (int i = 0; i < threadsCount; i++) {
            int startIndex = i * elementsPerThread;
            int endIndex = (i + 1) * elementsPerThread;
            calculators[i] = new PartialSumCalculator(array, startIndex, endIndex);
            executor.execute(calculators[i]);
        }

        executor.shutdown();

        try {
            executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Combine the partial sums
        int totalSum = 0;
        for (PartialSumCalculator calculator : calculators) {
            totalSum += calculator.getPartialSum();
        }

        System.out.println("Total sum: " + totalSum);
    }
}
