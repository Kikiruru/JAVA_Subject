package Week06;

public class Rectangle implements IGraphics{
	private double length, width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double perimeter() {
		return length * 2 + width * 2;
	}
	
	public void draw() {
		//System.out.println("도형 Rectangle을 그립니다.");
		System.out.println("Rectangle Draw");
	}
	
	public String toString() {
		return "Rectangle [length="+ length +", width="+ width +"]";
	}
}
