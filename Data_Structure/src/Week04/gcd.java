package Week04;

class F{ //최대공약수 두 수를 나눌수 있는 가장큰 수
	public static int gcd_(int a, int b) {
		if(b == 0)
			return a;
		else
			return gcd_(b, a%b);
	}
}

public class gcd {
	public static void main(String[] args) {
		System.out.print(F.gcd_(3, 2));
	}
}
