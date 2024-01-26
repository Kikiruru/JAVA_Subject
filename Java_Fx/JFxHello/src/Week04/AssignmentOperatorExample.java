package Week04;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 22;
		int c = -5;
		
		a++;
		c *= 2;
		b += -7;
		a -= ++b;
		c /= a + 8;
		b %= -c;
		
		System.out.println(a + " "+ b + " "+ c);
	}
}
