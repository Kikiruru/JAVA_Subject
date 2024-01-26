package Week11;
import java.util.Scanner;
public class CircleTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Circle cir;
		double rad;
		int sec;
		
		System.out.print("반지름을 입력하세요 >> ");
		rad = in.nextDouble();
		cir = new Circle(rad);
		
		System.out.print("1. 넓이, 2. 원둘레 >> 선택 : ");
		sec = in.nextInt();
		
		if(sec == 1)
			cir.getArea();
		else if(sec == 2)
			cir.getCircum();
		else
			System.out.println("해당 메뉴 없음");
		in.close();
	}
}
