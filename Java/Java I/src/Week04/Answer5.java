package Week04;
import java.util.Scanner;
public class Answer5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double up, down, high, result;
		
		System.out.print("윗변 데이터를 입력하세요 >>\n");
		up = in.nextDouble();
		System.out.print("아랫변 데이터를 입력하세요 >>\n");
		down = in.nextDouble();
		System.out.print("높이 데이터를 입력하세요 >>\n");
		high = in.nextDouble();
		
		result = (up + down)*high/2;
		
		System.out.println("사다리꼴 넓이 : "+ result);
		in.close();
	}
}
