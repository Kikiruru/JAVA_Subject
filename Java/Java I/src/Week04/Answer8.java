package Week04;
import java.util.Scanner;
public class Answer8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int data, result;
		
		System.out.print("정수를 입력하세요 >>");
		data = in.nextInt();
		
		result = (data%100)/10;
		
		System.out.println("두 번째 자리 수 : "+ result);
		in.close();
	}
}
