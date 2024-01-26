package Weeek10;
import java.util.Scanner;
public class Answer6 {
	public static void main(String[] args) {
		int total = 0;
		int count = input("인원수를 입력하세요 >> "); //input() 호출
		for(int i = 0; i < count; i++) {
			int rnd = (int)(Math.random()*5) + 1;
			int value = valueAt(rnd); // 가격반환 
			String menu = menuAt(rnd); // 메뉴 반환 
			System.out.println("난수 :"+ rnd +", 메뉴 :"+ menu +", 가격 :"+ value);
			total += value;
		}
		
		int money = input("주문합계 :"+ total +"  >> ");
		System.out.println("받은 돈 : "+ money);
		System.out.println(money - total != 0 ? "거스름 돈 : "+ (money - total) : "거스름 돈 없음");
	}
	
	public static int input(String str) {
		Scanner key = new Scanner(System.in);
		int a;
		System.out.print(str);
		a = key.nextInt();
		return a;
	}
	
	public static int valueAt(int a) {
		int price = 0;
		switch(a) {
			case 1:
				price = 3000;
				break;
			case 2:
				price = 2000;
				break;
			case 3:
				price = 2500;
				break;
			case 4:
				price = 3500;
				break;
			case 5:
				price = 4000;
				break;
		}
		return price;
	}
	
	public static String menuAt(int a) {
		String menu = "0";
		switch(a) {
			case 1:
				menu = "카푸치노";
				break;
			case 2:
				menu = "에스프레소";
				break;
			case 3:
				menu = "아메리카노";
				break;
			case 4:
				menu = "카페라떼";
				break;
			case 5:
				menu = "자몽에이드";
				break;
		}
		return menu;
	}
}
