package Week12_q;

public class PriorityExample {

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("thread1 실행중입니다 . . . .");
			}
			System.out.println();
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("thread2 실행중입니다 . . . .");
			}
			System.out.println();
		});

		thread1.setPriority(5);
		thread2.setPriority(10);
		// 우선순위는 1~ 10까지 있다.

		thread1.start();
		thread2.start();
	}
}
