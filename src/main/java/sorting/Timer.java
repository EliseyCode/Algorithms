package sorting;

public class Timer extends Thread {

    public Timer() {
        start();
    }

    public void run() {
        int second = 0;
        while (true) {
            try {
                Thread.sleep(10000);
                second += 10;
                System.out.printf("Working for %d seconds \n", second);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
