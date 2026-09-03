package livelock;

public class LivelockApp {
    private static boolean aDone = false;
    private static boolean bDone = false;

    public static void main() {
        Thread thread1 = new Thread(() -> {
            while (!aDone) {
                if (!bDone) {
                    System.out.println("A: you hang up first");
                    sleep();
                    continue;
                }
                aDone = true;
                System.out.println("A: hung up");
            }
        });
        Thread thread2 = new Thread(() -> {
            while (!bDone) {
                if (!aDone) {
                    System.out.println("B: you hang up first");
                    sleep();
                    continue;
                }
                bDone = true;
                System.out.println("B: hung up");
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
