package Week05;

abstract class Shape {
	private String name; // 도형 이름	
	protected double x, y;
	
	public Shape(String name) {
		this.name = name;
	}
	
	abstract double getArea();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Triangle extends Shape{
	//private double x, y; //밑변, 높이
	
	public Triangle(String name, double x, double y) {
		super(name); this.x = x; this.y = y;
	}
	
	public double getArea() {
		return x*y/2;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}
}

class Circle extends Shape{
	//private double x, y; //반지름, 파이
	
	Circle(String name, double x, double y){
		super(name); this.x = x; this.y = y;
	}
	
	public double getArea() {
		return x*x*y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}
}