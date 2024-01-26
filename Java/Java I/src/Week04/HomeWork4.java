package Week04;

import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("무슨 커피 드릴까요? ");
		String order = in.next();
		
		switch (order) {
		case "에스프레소":
			System.out.println("에스프레소를 선택하셨습니다");
		case "카푸치노":
			System.out.println("카푸치노를 선택하셨습니다");
	            break;
		case "카페라떼":
			System.out.println("카페라떼를 선택하셨습니다");
		case "아메리카노":
			System.out.println("아메리카노를 선택하셨습니다");
		default:
			System.out.println("메뉴에 없습니다!");
		}
	System.out.println("프로그램 종료");
	in.close();
	}
}
