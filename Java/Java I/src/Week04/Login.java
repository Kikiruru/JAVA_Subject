package Week04;
import java.util.Scanner;
public class Login {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String id;
		int password;
		
		System.out.print("아이디를 입력하세요 >> ");
		id = in.next();
		System.out.print("패스워드를 입력하세요 >> ");
		password = in.nextInt();
		
		if(id.equals("java") && password == 12345) // 문자열은 비교연산자로 비교할 수 없다. "java".equals(id)로 사용해도 무방 
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		System.out.println("프로그램 종료");
		
		/*
		 * if(id.equals("java")) {
		 * 		if(password == 12345)
		 * 			System.out.println("로그인 성공");
		 *		else
		 *			System.out.println("패스워드 불일치 로그인 실패");
		 *}
		 *	else if(password == 12345)
		 *		System.out.println("아이디 불일치 로그인 실패");
		 *	else
		 *		System.out.println("아이디와 패스워드 불일치 로그인 실패");
		 **/
		in.close();
	}
}
