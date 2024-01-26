package Week06;
import java.util.Scanner;
/*난수 합 200이상이 프로그램 종료
 * 중첩 반복 & break 사용
 * 레이블을 사용하여 전체 반복문 벗어나기 
 */
public class App1_loop2 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int value, rnd, hap = 0;
		
		exit: do {
			System.out.print("난수 생성 횟수를 하세요(종료:0) >>");
			value = key.nextInt();
			for(int c = 1; c <= value; c++) {
				rnd = (int)(Math.random()*50)+1;
				hap += rnd;
				System.out.print(c +")"+ rnd + "\t");
				if (hap >= 200) {
					System.out.println("\thap = "+ hap);
					break exit;
				}
			}
			System.out.println("\thap = "+ hap);
		} while(value > 0);
		
		System.out.println("\n프로그램 종료");
		key.close();
	}
}
