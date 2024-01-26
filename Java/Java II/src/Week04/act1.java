package Week04;

abstract class Area {
	abstract double area();
	abstract void write();
}

class Circle extends Area {
	static final double PI = 3.14;
	double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	double area() {
		return r * r * PI;
	}
	
	void write() {
		System.out.print("Circle [radius= "+ r);
		System.out.printf("\tarea = %.2f]\n", area());
	}
}

class Rectangle extends Area{
	private double d1, d2;
	
	public Rectangle(double d1, double d2) {
		this.d1 = d1;
		this.d2 = d2;
	}
	
	double area() {
		return d1 * d2;
	}
	
	void write() {
		System.out.print("Rectangle [ga = "+ d1 +"\tse = "+ d2);
		System.out.printf("\tarea = %.2f]\n", area());
	}
}

public class act1 {
	public static void main(String[] args) {
		Area a1 = new Circle(5);
		Area a2 = new Rectangle(5, 5);
		
		a1.write();
		a2.write();
	}
}
