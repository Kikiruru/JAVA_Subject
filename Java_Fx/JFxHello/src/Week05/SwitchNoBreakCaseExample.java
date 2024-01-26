package Week05;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*3) + 1;
		System.out.println(num +"번이 선택되었습니다.");
		switch(num) {
		case 1:
			System.out.println("1입니다.");
		case 2:
			System.out.println("2입니다.");
		case 3:
			System.out.println("3입니다.");
		default:
			System.out.println("-");
		}
	}
}
