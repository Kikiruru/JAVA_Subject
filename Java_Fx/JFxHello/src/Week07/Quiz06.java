package Week07;

public class Quiz06 {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		String strNum3 = args[2];
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int num3 = Integer.parseInt(strNum3);
		
		int sum = num1 + num2 + num3;
		int avg = sum/3;
		String grade;
		
		if(avg > 90) {
			if(avg >= 95)
				grade = "A+";
			else
				grade = "A";
		}
		else if(avg > 80) {
			if(avg >= 85)
				grade = "B+";
			else
				grade = "B";
		}
		else if (avg > 70) {
			if(avg >= 75)
				grade = "C+";
			else
				grade = "C";
		}
		else
			grade = "D";
		
		System.out.println("입력된 숫자 : "+ num1 +","+ num2 +","+ num3);
		System.out.println("sum : "+ sum +", avg : "+ avg +", grade : "+ grade);
	}
}
