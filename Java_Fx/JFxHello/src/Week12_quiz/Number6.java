package Week12_quiz;

public class Number6 {
	public static void main(String[] args) {
		String inputData1 = null;
		String inputData2 = null;
		try {
			inputData1 = args[0];
			inputData2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) { //a
			System.out.println("실행 매개값의 변수가 부족합니다.");
			System.out.println("|실행 방법|");
			System.out.println("java TryCatchFinallyRuntionExceptionExample  num1  num2");
			return;
		}
		try {
			int value1 = Integer.parseInt(inputData1);
			int value2 = Integer.parseInt(inputData2);
			int result = value1 + value2;
			System.out.println(inputData1+" + "+inputData2+" = "+result);
		}catch(NumberFormatException e) { //b
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
