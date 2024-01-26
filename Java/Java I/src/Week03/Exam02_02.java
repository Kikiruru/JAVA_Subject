package Week03;

import java.util.Scanner;

public class Exam02_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value1, value2; //비트연산을 하려면 정수만 가능(또는 boolean형)
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		value1 = in.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		value2 = in.nextInt();
		
		System.out.println(value1 +" & "+ value2 +" : "+( value1 & value2));
		System.out.println(value1 +" | "+ value2 +" : "+( value1 | value2));
		System.out.println("~"+ value1 + " : "+ ~value1);
		System.out.println(value1 +" ^ "+ value2 + " : "+ (value1 ^ value2));
		System.out.println(value1 +">>2 : "+ (value1>>2));
		System.out.println(value2 +"<<3 : "+ (value2<<3));
		in.close();
	}
}
