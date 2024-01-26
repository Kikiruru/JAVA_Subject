package Week13_1;

public class Circle {
	private double r;
	public Circle(double r) {
		this.r = r;
	}
	
	public double getR() {
		return r;
	}
	
	double getArea() {
		return r*r*3.14;
	}
	
	void write() {
		System.out.printf("Circle 넓이 : %.2f\n", getArea());
	}
}

class Ball extends Circle {
	public Ball(double r) {
		super(r);
	}
	
	@Override
	public double getArea() {
		return super.getArea()*4;
	}
	
	@Override
	public void write() {
		System.out.printf("Ball 넓이 : %.2f\n", getArea());
	}
}

class Cylinder extends Circle{
	private double h;
	public Cylinder(double r, double h) {
		super(r);
		this.h = h;
	}
	
	@Override
	public double getArea() {
		double value = super.getArea()*2;
		value += 2*3.14*getR()*h;
		return value;
	}
	
	@Override
	public void write() {
		System.out.printf("Cylinder 넓이 : %.2f\n", getArea());
	}
}