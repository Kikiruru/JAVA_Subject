package Week10;

public class exam02 {
	protected String field;

	int a;
	int b;

	public exam02() {
		a = 20;
		b = 30;

		System.out.println(a);
		System.out.println(b);
	}

	public exam02(int a, int b) {
		this.a = a;
		this.b = b;

		System.out.println(a);
		System.out.println(b);
	}

	public int sum() {
		a = 100;
		b = 200;

		int c = a + b;

		return c;
	}

}
