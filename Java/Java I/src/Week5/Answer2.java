package Week5;
import java.util.Scanner;
public class Answer2 {
	public static void main(String[] args) {
		double x, f = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("x 값을 입력하세요 : ");
		x = in.nextDouble();
		
		if(x<0)
			f = x*x*x - 9*x + 2;
		else if(x>0)
			f = 7*x + 2;
		
		System.out.println("함수값은 "+ (int)f +"입니다.");
		in.close();
	}
}
