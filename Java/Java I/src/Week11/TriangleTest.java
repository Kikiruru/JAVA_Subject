package Week11;
import java.util.Scanner;
public class TriangleTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Triangle tri = new Triangle();
		double base, height;
		
		System.out.print("밑변의 길이를 입력하세요 >> ");
		base = in.nextDouble();
		tri.base = base;
		System.out.print("높이를 입력하세요 >> ");
		height = in.nextDouble();
		tri.height = height;
		
		System.out.println("삼각형의 넓이 : "+ tri.area());
		in.close();
	}
}
