package JFx_Thread;

public class User2_2 extends Thread {
	private Calculator2 calculator;

	public void setCalculator(Calculator2 calculator) {
		this.setName("User2"); // 스레드 이름을 User2로 설정
		this.calculator = calculator; // 공유 객체인 calculator를 필드에 저장
	}

	public void run() {
		calculator.setMemory(50); // 공유 객체인 calculator를 필드에 50을 저장
	}
}
