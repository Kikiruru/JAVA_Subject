package Week06;
import java.util.Scanner;
public class Answer5 {
	public static void main(String[] args) {
		char ch;
		int cntA = 0, cnta = 0;
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print(i+1 +") >> ");
			ch = in.next().charAt(0);
			if(ch >= 'a' && ch <= 'z') {
				System.out.println("소문자");
				cnta++;
			} else if(ch >= 'A' && ch <= 'Z') {
				System.out.println("대문자");
				cntA++;
			} else
				System.out.println("영문자 아님");
		}
		System.out.println("소문자 개수 = "+ cnta);
		System.out.println("대문자 개수 = "+ cntA);
		System.out.println("프로그램 종료");
		in.close();
	}
}
