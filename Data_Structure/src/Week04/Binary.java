package Week04;

import java.util.Scanner;

class D{
	public static void writeBinary(int n) {
		if(n <= 0)
			return;
		if(n%2 == 0) {
			writeBinary(n/2);
			System.out.print("0");
		}
		else {
			writeBinary(n/2);
			System.out.print("1");
		}
	}
}

public class Binary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		int number = input.nextInt();
		
		System.out.printf("10진수 %d는 이진수로 ",number);
		D.writeBinary(number);
		System.out.print(" 입니다");
		input.close();
	}
}
