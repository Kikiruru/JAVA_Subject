package Week04;
import java.util.Scanner;
public class Answer7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int data, area, round;
		
		System.out.print("정사각형의 변의 길이를 입력하세요 : ");
		data = in.nextInt();
		
		area = data*data;
		round = data*4;
		
		System.out.println("정사각형의 넓이는 "+ area +"이고, 둘레는 "+ round +" 입니다.");
		in.close();
	}
}
