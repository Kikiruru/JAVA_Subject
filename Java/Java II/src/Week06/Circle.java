package Week06;

public class Circle implements IGraphics{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double perimeter() {
		return radius * 2 * 3.14;
	}
	
	public void draw() {
		//System.out.println("도형 Circle을 그립니다.");
		System.out.println("Circle Draw");
	}
	
	public String toString() {
		return "Circle [radius="+ radius +"]";
	}
}
