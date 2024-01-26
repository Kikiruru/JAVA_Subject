package Week5;
import java.util.Scanner;
public class Answer6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char car;
		int hour, pee = 0;
		String car2 = "";
		
		System.out.print("차량의 종류 : 승용차(c) 버스(b) 트럭(t) >>");
		car = in.next().charAt(0);
		System.out.print("시간을 입력하세요 >>");
		hour = in.nextInt();
		
		switch(car) {
		case 'c':
		case 'C':
			pee = hour*2000;
			car2 = "승용차";
			break;
		case 'b':
		case 'B':
			pee = hour*3000;
			car2 = "버스";
			break;
		case 't':
		case 'T':
			pee = hour*4000;
			car2 = "트럭";
			break;
		}
		System.out.println("차량종류: "+ car2 +"   시간: "+ hour +"   total: "+ pee);
		in.close();
	}
}
