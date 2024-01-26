package Week04;
import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("무슨 커피 드릴까요? ");
	String order = in.next();
	
	int price = 0; //if문을 위해 0으로 초기
	
	switch(order) {
	case "에스프레소":
		price = 3000;
		break;
	case "카푸치노":
		price = 3500;
		break;
	case "카페라떼":
		price = 4000;
		break;
	case "아메리카노":
		price = 2000;
		break;
	default:
		System.out.println("메뉴에 없습니다!");
	}
	
	if(price != 0)
		System.out.println(order +"는 "+ price +"원입니다.");
	System.out.println("프로그램 종료");
	in.close();
	}
}
