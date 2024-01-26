package Weeek10;
//실행용 
public class RectangleExample {
	public static void main(String[] args) {
		//클래스로부터 객체 생성
		//Rectangle r; //클래스로부터 객체 선언 
		Rectangle r = new Rectangle();
		Rectangle rc = new Rectangle();
		
		r.w = 10;
		r.h = 4;
		rc.w = 5;
		rc.h = 2;
		//r.w != rc.w 서로 다른 힙 주소를 갖는다(클래스가 2개 선언된 것) 
		
		System.out.println("area1 : "+ r.area());
		System.out.println("area2 : "+ rc.area());
		System.out.println("perimeter1 : "+ r.perimeter());
		System.out.println("perimeter2 : "+ rc.perimeter());
	}
}
