package Assignment_9;
    class NumberThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
    }

    public class ThreadNew {
        public static void main(String[] args) {
            NumberThread numberThread = new NumberThread();
            numberThread.start();
        }
    }

