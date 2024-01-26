package Week12;
import java.util.Scanner;

class Menu{
	private int rand, cost; //난수, 가격
	private String menu; //메뉴
	private static int num; //정적 멤버
	private int cnt;
	
	public Menu(int rand, String menu, int cost) {
		this.rand = rand;
		this.menu = menu;
		this.cost = cost;
		cnt = ++num;
	}
	
	public int getCost() { //getter : 필드값 반환
		return cost;
	}
	public String toString() { //객체 내용 문자열 반환
		return cnt +") Menu [난수="+ rand +", 메뉴="+ menu +", 가격="+ cost +"]";
	}
}

class Manage{
	final static String[] menu = {"카푸치노", "에스프레소", "아메리카노", "카페라떼", "자몽에이드"};
	final static int[] value = {3000, 2000, 2500, 3500, 4000};
	public static Menu creation() { //정적 메소드
		int rnd = (int)(Math.random()*5) + 1; // 1 ~ 5까지 정수
		Menu m	= new Menu(rnd, menu[rnd-1], value[rnd-1]);
		return m;
	}
}

public class MenuApp {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Menu[] menu; //객체 배열 선언
		int total = 0;
		System.out.print("인원수를 입력하세요 >> 	");
		menu = new Menu[key.nextInt()]; //객체 배열 생성
		for(int i = 0; i < menu.length; i++) {
			menu[i] = Manage.creation();
			total += menu[i].getCost();
		}
		//객체 배열 원소 출력
		for(Menu m : menu)
			System.out.println(m); //-> 자동으로 toString()메소드 호출(클래스 변수, 객체참조 변수)
		System.out.println("주문합계 : "+ total);
		key.close();
	}
}
