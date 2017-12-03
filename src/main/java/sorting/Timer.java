package sorting;

public class Timer extends Thread {

    private static boolean isDone;

    public Timer() {
        start();
    }

    public void run() {
        startTimer();
    }

    private static void startTimer() {
        long startTime = System.currentTimeMillis();

        while (!isDone) {
            Thread.currentThread().interrupt();
        }

        long endTime = System.currentTimeMillis();

        printTime(startTime, endTime);
    }

    private static void printTime(long startTime, long endTime) {
        int min = (int) (endTime - startTime) / 1000 / 60;
        int secs = (int) (endTime - startTime) / 1000;
        System.out.format("Time until complete %d min %d sec %d m.sec \n", min, secs, (endTime - startTime) / 100);
    }

    public static void setIsDone(boolean done) {
        isDone = done;
    }
}