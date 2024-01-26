package Week04;
import java.util.Scanner;
public class dgress {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("각도를 입력하세요 >> ");
		int degree = in.nextInt();
		
		if(degree == 90)
			System.out.println("직각입니다.");
		else
			System.out.println("직각이 아닙니다.");
		
		in.close();
	}
}
