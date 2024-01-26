package Week03;

class A {
	public static void increment(int i) { //1씩 증가시키는 함수
		i = i + 1;
	}
	public static void increment(CI i) {
		i.a = i.a + 1;
	}
	public static void increment(int[] i) {
		for(int j = 0; j < i.length; j++) {
			i[j] += 1;
		}
	}
	public static int add(int a, int b) {
		return a+b;
	}
}

class CI{
	int a;
}

public class Act1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int c = A.add(x, y);
		int[] xb = {10,20,30};
		System.out.println(c);
		A.increment(x);
		System.out.println(x);
		CI xa = new CI();
		xa.a = 10;
		A.increment(xa);
		System.out.println(xa.a);
		A.increment(xb);
		for(int i = 0; i < xb.length ; i++) {
			System.out.println(xb[i]);
		}
	}
}
