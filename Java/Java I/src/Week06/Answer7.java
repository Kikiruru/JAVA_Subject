package Week06;
import java.util.Scanner;
public class Answer7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ran1, ran2, result, cnt = 0, cnt2 = 1;
		// 랜덤1, 랜덤2, 답, 정답횟수, 실행횟수 
		char ch;
		
		System.out.println("구구단을 시작합니다");
		while(true) {
			ran1 = (int)(Math.random()*9)+1;
			ran2 = (int)(Math.random()*9)+1;
			System.out.printf("%d) %d * %d = ",cnt2,ran1,ran2);
			result = in.nextInt();
			if(result == ran1*ran2) {
				System.out.println("정답입니다");
				cnt++;
			} else
				System.out.println("오답입니다");
			cnt2++;
			System.out.print("종료하려면 n 또는 N을 입력하세요 >>");
			ch = in.next().charAt(0);
			if(ch == 'N' || ch == 'n')
				break;
		}
		System.out.println("\n정답 횟수 = "+ cnt);
		System.out.println("프로그램 종료");
		in.close();
	}
}
