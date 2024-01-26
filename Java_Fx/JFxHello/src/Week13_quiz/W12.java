package Week13_quiz;

public class W12 {
    public static void main(String[] args) {
        Thread thread = new CT();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        thread.interrupt();
    }
}

class CT extends Thread {
    public void run() {
        while (true) {
            System.out.println("RUNNING");
            if(Thread.interrupted()) break;
        }
        System.out.println("EXIT");
    }
}
