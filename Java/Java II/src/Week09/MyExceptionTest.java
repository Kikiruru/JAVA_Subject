package Week09;

class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8054878788011358754L;

	public MyException(String message) {super(message);}
}

public class MyExceptionTest {
	public static void checkNegative(int number) throws MyException{
		if (number < 0) {
			throw new MyException("음수는 안됩니다."); // throw : 임의로 예외 객체 생성 시 사용
		}
		System.out.println("다행이 음수가 아니군요");
	}
	
	public static void main(String[] args) {
		try {
			checkNegative(1);
			checkNegative(-1);
		} catch (MyException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace(); // 예외가 발생한 과정
		}
	}
}
