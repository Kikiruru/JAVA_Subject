package Week03;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		String s1, s2, result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 문자열을 입력하세요 ==>");
		s1 = s.next();
		System.out.print("두번째 문자열을 입력하세요 ==>");
		s2 = s.nextLine();
		
		result = s1 + s2;
		System.out.println("완성된 문자열은 \""+ result +"\"입니다.");
		s.close();
	}
}
