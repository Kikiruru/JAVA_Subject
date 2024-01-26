package Week07;

public class Answer1 {
	public static void main(String[] args) {
		Action ac = new Action() {
			public void move() {
				System.out.println("익명 구현 객체 이동");
			}
		};
		Action rac = () -> {
			System.out.println("람다식 이동");
		};
		
		ac.move();
		rac.move();
	}
}
