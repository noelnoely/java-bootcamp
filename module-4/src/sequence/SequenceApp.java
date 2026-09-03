package sequence;

public class SequenceApp {
    private static final Object lock = new Object();
    private static boolean isFirstTurn = true;

    public static void main() {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (!isFirstTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("1");
                    isFirstTurn = false;
                    lock.notify();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (isFirstTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("2");
                    isFirstTurn = true;
                    lock.notify();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
