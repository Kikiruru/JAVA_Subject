package Week04;

import java.util.Scanner;

public class rand {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 >> ");
		int data = in.nextInt();
		
		int dice=(int)(Math.random()*90) + 10; //10 ~ 99까지 난수 생성 
		// Math.random() : 0 ~ 1까지 무작위 실수 생성 (0 <= r < 1)
		if(dice % data == 0)
			System.out.println(dice +" 는(은)"+ data +" 배수 입니다");
		else
			System.out.println(dice +" 는(은)"+ data +" 배수가 아닙니다");
		System.out.println("프로그램 종료");
		in.close();
	}
}
