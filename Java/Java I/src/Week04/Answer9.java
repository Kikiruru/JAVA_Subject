package Week04;
import java.util.Scanner;
public class Answer9 {
	public static void main(String[] args) {
		int data, one,two, thr, reverse;
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >>");
		data = in.nextInt();
		
		one = data/100;
		two = (data%100)/10;
		thr = data%10;
		
		reverse = thr*100 + two*10 + one;
		
		System.out.println("거꾸로 된 데이터 : "+ reverse);
		in.close();
	}

}
