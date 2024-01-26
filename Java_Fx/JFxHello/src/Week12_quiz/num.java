package Week12_quiz;

public class num {
	public static void main(String[] args) {
		int a = 5;
		
		try {
			@SuppressWarnings("unused")
			int b = a/0;
			System.out.print("정상 ");
		}
		catch(ArithmeticException e) {
			System.out.print("에러 ");
		}
		finally {
			System.out.println("입니다.");
		}
	}
}
