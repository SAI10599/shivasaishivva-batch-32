package Assignment_9;


    class RunThread implements Runnable{
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
    }

    public class RunnableThread{
        public static void main(String[] args) {
            Thread numberThread = new Thread(new RunThread());
            numberThread.start();
        }
    }

