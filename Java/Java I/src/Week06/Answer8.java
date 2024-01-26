package Week06;
import java.util.Scanner;
public class Answer8 {
	public static void main(String[] args) {
		int ran, cnt;
		Scanner in = new Scanner(System.in);
		
		System.out.print("난수 생성 횟수를 입력하세요(종료:0) >>");
		cnt = in.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			ran = (int)(Math.random()*5)+1; // 1~5
			
			if(ran == 3)
				continue;
			
			switch(ran) {
				case 1:
				System.out.print(ran +">하나  ");
				break;
				case 2:
					System.out.print(ran +">둘  ");
					break;
				case 4:
					System.out.print(ran +">넷  ");
					break;
				case 5:
					System.out.print(ran +">다섯  ");
					break;
			}
		}
		System.out.println("\n프로그램 종료");
		in.close();
	}
}
