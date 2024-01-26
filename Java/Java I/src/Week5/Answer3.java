package Week5;
import java.util.Scanner;
public class Answer3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt, pri = 0;
		String cfe;
		
		System.out.print("주문하려는 커피 종류를 입력하세요 >>");
		cfe = in.next();
		
		System.out.print("수량을 입력하세요 >>");
		cnt = in.nextInt();
		
		switch(cfe) {
		case "에스프레소":
			pri = cnt*2000;
			break;
		case "아메리카노":
			pri = cnt*2500;
			break;
		case "카푸치노":
			pri = cnt*3000;
			break;
		case "카페라떼":
			pri = cnt*3500;
			break;
		}
		
		System.out.println(cfe +" "+ pri+"원 입니다");
		in.close();
	}
}
