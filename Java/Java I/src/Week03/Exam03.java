package Week03;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value;
		String result;
		
		System.out.print("정수를 입력하세요 >>");
		value = in.nextInt();
		
		result = value > 0 ? "양수" : "음수";
		System.out.println(value + "은/는 " + result + "입니다.");
		in.close();
	}
}
