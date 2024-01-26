package Week09;

class Point {
	int x;
	int y;
	public Point() {
		x = 0; y = 0;
	}
	public Point(int x1, int y1) {
		x = x1; y = y1;
	}
}

public class Point_Test {
	public static void increment(int a) {
		a++;
		System.out.println(a);
	}
	public static void increment(Point p) {
		p.x++; p.y++;
	}
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(0, 8);
		p1 = p2;
		p1.x = 10;
		
		System.out.println(p1.x);
		System.out.println(p1.y);
		int k = 10;
		increment(k);
		System.out.println(k);
		increment(p1);
		System.out.println(p1.x);
		System.out.println(p1.y);
		System.out.println(p2.x);
		System.out.println(p2.y);
	}
}