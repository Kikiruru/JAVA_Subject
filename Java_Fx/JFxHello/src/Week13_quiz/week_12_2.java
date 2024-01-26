package Week13_quiz;

class Work extends Thread {
	@Override
	public void run() { // 스레드 실행 내용
		for (int i = 0; i < 9; i++) {
			System.out.println("일을 합니다. (" + i + ")");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class Rest extends Thread {
	@Override
	public void run() { // 스레드 실행 내용
		for (int i = 0; i < 3; i++) {
			System.out.println("휴식을 취합니다. (" + i + ")");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
		}
	}
}

public class week_12_2 {
	public static void main(String[] args) { // 메인 스레드
		Thread thread1 = new Work();
		Thread thread2 = new Rest();
		thread1.start(); // BeepThread 스레드
		try {
			Thread.sleep(2500);
		} catch (Exception e) {
		}
		thread2.start();
	}
}