package Week11;
import java.util.Scanner;
public class BoxTest {
	public static void main(String[] args) {
		Box b;
		Scanner k = new Scanner(System.in);
		int width, length, height;
		System.out.print("가로를 입력하세요 >> ");
		width = k.nextInt();
		System.out.print("세로를 입력하세요 >> ");
		length = k.nextInt();
		System.out.print("높이를 입력하세요 >> ");
		height = k.nextInt();
		
		b = new Box(width, length, height);
		
		System.out.println("가로 : "+ b.width);
		System.out.println("세로 : "+ b.length);
		System.out.println("높이 : "+ b.height);
		b.volume();
		k.close();
	}
}
