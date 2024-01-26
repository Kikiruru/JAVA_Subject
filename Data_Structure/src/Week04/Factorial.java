package Week04;

class A{
	public static long factorial(int n) {
		if(n <= 1) return 1;
		else return n * factorial(n-1);
	}
}

public class Factorial {
	public static void main(String[] args) {
		long result = 1;
		int n = 4;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.println(result);
		System.out.println(A.factorial(4));
	}
}
