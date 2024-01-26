package Week06;
import java.util.Scanner;
public class Answer4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int data = 0, cnt = 0, hap = 0;
		double avg;
		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		while(data != -1) {
			data = in.nextInt();
			
			if(data != -1) {
				cnt++;
				hap += data;
			}
		}
		avg = (double)hap/cnt;
		
		if(cnt == 0)
			System.out.println("입력된 수가 없습니다.");
		else
			System.out.println("정수의 개수는 "+ cnt +"개이며 평균은 "+ avg +"입니다.");
		System.out.println("프로그램 종료");
		in.close();
	}
}
