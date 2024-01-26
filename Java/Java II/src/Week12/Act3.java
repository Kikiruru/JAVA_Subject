package Week12;

class Job3 extends Thread {
	String str;
	
	public Job3(String str) {
		this.str = str;
	}
	
	public void run() {
		int n = 0;
		while(true) {
			System.out.println(str +" : "+ n++);
			if(n>5) break;
		}
	}
}
public class Act3 {
    public static void main(String[] args) {
        Thread t1 = new Job3("Thread1");
        Thread t2 = new Job3("Thread2");
        t1.start();
        t2.start();
    }
}
