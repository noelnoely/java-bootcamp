package deadlock;

public class DeadlockApp {
    private static final Object accountA = new Object();
    private static final Object accountB = new Object();

    public static void main() {
        Thread thread1 = new Thread(() -> {
            synchronized (accountA) {
                System.out.println("Transfer-1: locked account A");
                sleep();

                synchronized (accountB) {
                    System.out.println("Transfer-1: locked account B");
                    System.out.println("Transfer-1: A → B done");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (accountB) {
                System.out.println("Transfer-2: locked account B");
                sleep();

                synchronized (accountA) {
                    System.out.println("Transfer-2: locked account A");
                    System.out.println("Transfer-2: B → A done");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    private static void sleep() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
