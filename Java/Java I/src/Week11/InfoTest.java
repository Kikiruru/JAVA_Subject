package Week11;
import java.util.Scanner;
public class InfoTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Info in1, in2;
		
		System.out.print("아이디를 입력 하세요 >>> ");
		in1 = new Info(key.next());
		System.out.println("첫번째 객체 생성 완료");
		System.out.print("아이디를 입력하세요 >>> ");
		in2 = new Info(key.next());
		System.out.println("두번째 객체 생성 완료");
		
		System.out.println("첫번째 객체의 아이디와 비밀번호 출력");
		in1.display();
		System.out.println("두번째 객체의 아이디와 비밀번호 출력");
		in2.display();
		key.close();
	}
}
