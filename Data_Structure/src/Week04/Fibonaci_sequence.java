package Week04;
import java.util.Scanner;
class C{
	public static int fibonaci(int n) {
		if(n <= 0) return 0;
		if(n == 1) return 1;
		else return fibonaci(n-1) + fibonaci(n-2);
		
		/*
		if(n <= 0) return 0;
		if(n == 1) return 1;
		int p2 = 0;
		int p1 = 1;
		for(int i = 2; i <= n; i++){
			int f = p1 + p2;
			p2 = p1;
			p1 = f;
		}
		return f;
		 */
	}
}

public class Fibonaci_sequence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("몇번째 피보나치 수열을 구할지 입력하시오:");
		int number = input.nextInt();
		
		System.out.printf("%d번째 피보나치 수열 : ", number);
		System.out.println(C.fibonaci(number));
		input.close();
	}
}
