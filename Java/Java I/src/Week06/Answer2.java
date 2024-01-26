package Week06;
import java.util.Scanner;
public class Answer2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char ch;
		
		System.out.print("문자를 입력하세요(k미만으로 입력) >>");
		ch = in.next().charAt(0);
		
		if(ch < 'k') {
			for(char c = 'a'; c <= ch; c++)
				System.out.print(c +" ");
		}
		else
			System.out.println("문자 k이상이 입력되어 종료합니다");
		in.close();
	}
}
