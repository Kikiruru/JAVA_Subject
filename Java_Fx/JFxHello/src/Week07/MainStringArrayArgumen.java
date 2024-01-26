package Week07;

public class MainStringArrayArgumen {
	public static void main(String[] args) {
		if(args.length != 2) { // 입력된 데이터의 개수가 두 개가 아닐 경우
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);// C. (    ) 프로그램 강제 종료
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		
		System.out.println(num1 +" + "+ num2 +" = "+ result);
	}
}
