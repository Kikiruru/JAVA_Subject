package Week04;
import java.util.Scanner;
public class Answer6 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int hour, min, sec, result;
	
	System.out.print("시간을 입력하세요 : ");
	hour = in.nextInt();
	System.out.print("분을 입력하세요 : ");
	min = in.nextInt();
	System.out.print("초를 입력하세요 : ");
	sec = in.nextInt();
	
	result = hour*60*60 + min*60 + sec;
	System.out.println(hour +"시 "+ min +"분 "+ sec +"초는 "+ result +"초 입니다.");
	in.close();
	}
}
