package Week07;
import java.util.Scanner;
public class Answer2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h; //높이
		int cnt = 0; //출력할 숫자 
		
		System.out.print("높이를 입력하세요 >> ");
		h = in.nextInt();
		
		for(int i=0;i<h;i++) {
			for(int j=0;j<=i;j++) {
				cnt++;
				System.out.print(cnt +"  "); //System.out.print(++cnt +"  ");
			}
			System.out.println();
		}
		in.close();
	}
}
