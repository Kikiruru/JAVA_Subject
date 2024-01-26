package Week12;

class Job2 extends Thread {
	public void run() {
		int n = 0;
		while(true) {
			System.out.println(""+n++);
			if(n>50) break;
		}
	}
}
public class Act2 {
    public static void main(String[] args) {
        Job2 t = new Job2();
        t.start();
    }
}
