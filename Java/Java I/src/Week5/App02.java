package Week5;
import java.util.Scanner;
/* while 반복문
 * 1. 사용자에게 입력 받은 두 개의 정수 사이의 홀수를 출력하는 프로그램
 * 2. 입력 받은 문자를 출력하는 프로그램, 단, 'f', 'F' 가 입력되면 반복문을 종료
 * 3. 사용자로부터 양의 정수와 음의 정수 리스트를 읽어 들이는 프로그램을 만드세요.
 * 양의 정수가 몇 개 입력되었는지, 음의 정수가 몇 개 입력되었는지 출력, 단 10개만 입력 
 */
public class App02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d1, d2; //1번 
		char ch; //2번 
		int data, total = 1, po = 0, ne = 0; //3번 
		//입력값 저장, 횟수저장, 양의 정수 개수 저장, 음의 정수 개수 저장 
		
		System.out.print("d1 >> ");
		d1 = in.nextInt();
		System.out.print("d2 >> ");
		d2 = in.nextInt();
		
		while(d1 <= d2) {
			if(d1 % 2 == 1) // 홀수
				System.out.print(d1 + "  ");
			d1++;
		}
		System.out.println("프로그램 종료");
		//ㄴ>1번 
		
		System.out.println("문자 : ");
		ch = in.next().charAt(0);
		
		while(ch != 'f' && ch != 'F') {
			System.out.println("ch = "+ ch);
			System.out.println("문자 : ");
			ch = in.next().charAt(0);
		}
		/*while(true){
		 * System.out.print("문자 : ");
		 * ch = in.next().charAt(0);
		 * if(ch == 'f' || ch == 'F')
		 * 		break;
		 * System.out.println("ch = "+ ch);
		 * }
		 */
		System.out.println("\n프로그램 종료");
		//ㄴ>2번 
		
		while(total < 11) {
			System.out.print("정수 입력 >> ");
			data = in.nextInt();
			if(data > 0) { //전제 : 0은 입력되지 않는다 
				po++;
			}
			else {
				ne++;
			}
			total++;
		}
		System.out.println("양의 정수 : "+ po);
		System.out.println("음의 정수 : "+ ne);
		System.out.println("\n프로그램 종료");
		//ㄴ>3번 
		in.close();
	}
}
