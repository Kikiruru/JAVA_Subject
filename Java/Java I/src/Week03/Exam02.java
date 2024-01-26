package Week03;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value; //정수 입력
		String result; //비교 결과 저장 
		
		System.out.print("정수를 입력하세요 > >");
		value = in.nextInt();
		//3의 배수 판단 작업 
		result = value % 3 == 0 ? "3의 배수" : "3의 배수가 아닙니다";
		System.out.println(value + "은/는 " + result);
		in.close();
	}	
}
