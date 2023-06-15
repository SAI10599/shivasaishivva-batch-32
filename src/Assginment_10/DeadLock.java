package Assginment_10;
    public class DeadLock {
        public static void main(String[] args) {
            final String resource1 = "Resource 1";
            final String resource2 = "Resource 2";

            Thread thread1 = new Thread(() -> {
                synchronized (resource1) {
                    System.out.println("Thread 1: Acquired resource 1 lock");

                    try {
                        Thread.sleep(1000); // Introduce delay to ensure Thread 2 gets a chance to acquire resource 2 lock
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1: Acquired resource 2 lock");
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                synchronized (resource2) {
                    System.out.println("Thread 2: Acquired resource 2 lock");

                    try {
                        Thread.sleep(1000); // Introduce delay to ensure Thread 1 gets a chance to acquire resource 1 lock
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2: Acquired resource 1 lock");
                    }
                }
            });

            thread1.start();
            thread2.start();
        }
    }


