package Week02;

import java.util.Scanner;

public class week02_app03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Info io1;
		Info io2;
		String id;
		
		System.out.print("아이디를 입력하세요 >>> ");
		id = in.next();
		io1 = new Info(id);
		System.out.println("첫번째 객체 생성 완료");
		System.out.print("아이디를 입력하세요 >>> ");
		id = in.next();
		io2 = new Info(id);
		System.out.println("두번째 객체 생성 완료\n");
		
		System.out.println("첫번째 객체의 아이디와 비밀번호 출력");
		io1.display();
		System.out.println("두번째 객체의 아이디와 비밀번호 출력");
		io2.display();
		in.close();
	}
}
