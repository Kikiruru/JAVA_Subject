package Week04;
import java.util.Scanner;
public class Answer3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double data;
		String result;
		
		System.out.print("실수입력: ");
		data = in.nextDouble();
		
		result = (data > 0) ? "양수 입니다" : "음수 입니다";
		
		System.out.println("입력된 실수 "+ data +" 는 "+ result);
		in.close();
	}
}
