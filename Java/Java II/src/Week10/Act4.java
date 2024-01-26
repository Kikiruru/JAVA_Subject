package Week10;

import java.util.Scanner;

public class Act4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "자바 프로그램은 재미 없습니다. 어렵습니다";
		
		System.out.print("문자를 입력하세요 >>>>");
		char ch = in.next().charAt(0);
		
		System.out.println("===== indexOf() 메소드 사용 =====");
		if(str.indexOf(ch) != -1) {
			System.out.println(ch +" 인덱스는 "+ str.indexOf(ch) +"입니다");
		}
		else
			System.out.println("해당 문자가 없습니다");
		
		System.out.println("===== charAt() 메소드 사용 =====");
		for(int i = 0; i <= str.length(); i++) {
			if(i == str.length())
			{
				System.out.println(ch +"는 해당 문자열에 없습니다");
				break;
			}
			if(ch == str.charAt(i)) {
				System.out.println(ch +" 인덱스는 "+ i +"입니다");
				break;
			}
		}
		
		System.out.println("프로그램 종료");
		in.close();
	}
}
