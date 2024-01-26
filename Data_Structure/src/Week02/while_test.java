package Week02;

import java.util.Scanner;

public class while_test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,m,k;
		
		System.out.print(':');
		n = in.nextInt();
		m = 1;
		
		while(m<=n) {
			k = 1;
			while(k<=m) {
				System.out.print('*');
				k++;
			}
			System.out.println();
			m++;
		}
		in.close();
	}
}
