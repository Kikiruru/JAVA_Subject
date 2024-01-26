package Week03;

import java.util.Scanner;

public class Problem_02 {
	public static void main(String[] args) {
		int a, b;
		double result;
		int k;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 계산할 값을 입력하세요 ==>");
		a = sc.nextInt();
		
		System.out.print("<1>덧셈 <2>뺄셈 <3>곱셉 <4>나눗셈 ==>");
		k = sc.nextInt();
		
		System.out.print("두번째 계산할 값을 입력하세요 ==>");
		b = sc.nextInt();
		
		if(k == 1) {
			result = a + b;
			System.out.println(a +"+"+ b +"="+ result);
		} else if(k == 2) {
			result = a - b;
			System.out.println(a +"-"+ b +"="+ result);
		} else if(k == 3) {
			result = a * b;
			System.out.println(a +"*"+ b +"="+ result);
		} else if(k == 4) {
			result = a / b;
			System.out.println(a +"/"+ b +"="+ result);
		} else
			System.out.println("Error");
		sc.close();
	}
}
