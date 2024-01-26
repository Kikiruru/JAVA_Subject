package Week02;

import java.util.Scanner;

public class a1 {
	public static void main(String[] args) {
		 // n과 m 사이의 수 중에서 3의 배수가 아닌 수들의 합 출력
		 Scanner in = new Scanner(System.in);
		 int sum = 0;
		 int n = in.nextInt();
		 int m = in.nextInt();
		 
		 System.out.print("(n, sum) = ");
		 while(n <= m) {
			 if(n % 3 != 0) {
				 sum += n;
			 }
			 System.out.print("("+ n++ +", "+ sum +"),  ");
		 }
		 System.out.println("\nsum = "+ sum);
		 in.close();
	 }
}
