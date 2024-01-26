package Week12;

class Job implements Runnable {
	public void run() {
		int n = 0;
		while(true) {
			System.out.println(""+n++);
			if(n>50) break;
		}
	}
}
public class Act1 {
    public static void main(String[] args) {
        Thread t = new Thread(new Job());
        t.start();
    }
}
