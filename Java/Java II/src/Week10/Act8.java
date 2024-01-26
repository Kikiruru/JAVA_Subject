package Week10;

import java.util.Scanner;

public class Act8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str;
		char ch;
		int cnt = 0;
		
		System.out.print("문자열 입력 : ");
		str = in.nextLine();
		System.out.print("문자 입력 : ");
		ch = in.next().charAt(0);
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch)
				cnt++;
		}
		
		System.out.println(str +" 문자열에서 "+ ch +" 문자는 "+ cnt +" 번"
				+ " 반복됩니다.");
		System.out.println("프로그램 종료");
		in.close();
	}
}
