package Week11;

public class Circle {
	double rad; //반지름
	
	public Circle(double rad) {
		this.rad = rad;
	}
	
	public void getArea() {
		System.out.println("원 넓이 : "+ rad*rad*3.14);
	}
	
	public void getCircum() {
		System.out.println("원 둘레 : "+ rad*2*3.14);
	}
}
