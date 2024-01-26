package Week13_quiz;

class EvenNumber implements Runnable { 
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
class OddNumber implements Runnable { 
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i*2+1);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

public class week_12_1 {
	public static void main(String[] args) { // 메인 스레드
		Runnable even = new EvenNumber();
		Runnable odd = new OddNumber();
		Thread thread1 = new Thread(even);
		Thread thread2 = new Thread(odd);
		
		thread1.start();
		thread2.start();
	}
}