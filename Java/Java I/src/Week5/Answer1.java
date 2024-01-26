package Week5;
import java.util.Scanner;
public class Answer1 {
	public static void main(String[] args) {
		int data;
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >>");
		data = in.nextInt();
		
		if(data%4 == 0) {
			System.out.println("4의 배수");
		}
		else {
			System.out.println("4의 배수 아닙니다");
		}
		in.close();
	}
}
