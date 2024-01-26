package Week13_2;
import java.util.Scanner;
class Menu{
	private int rand, cost; //난수, 가격
	private String menu; //메뉴
	private static int num;
	private int cnt;
	
	public Menu(int rand, String menu, int cost) {
		this.rand = rand;
		this.menu = menu;
		this.cost = cost;
		cnt = ++num;
	}
	
	public int getCost() {
		return cost;
	}
	public String toString() {
		return cnt +") Menu [난수="+ rand +", 메뉴="+ menu +", 가격="+ cost +"]";
	}
}

class Manage{
	final static String[] menu = {"카푸치노", "에스프레소", "아메리카노", "카페라떼", "자몽에이드"};
	final static int[] value = {3000, 2000, 2500, 3500, 4000};
	public static Menu creation() {
		int rnd = (int)(Math.random()*5) + 1; 
		Menu m	= new Menu(rnd, menu[rnd-1], value[rnd-1]);
		return m;
	}
}

public class MenuTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Menu menu = null;
		int total = 0;
		System.out.print("인원수를 입력하세요 >> ");
		int cnt = key.nextInt();
		for(int i = 0; i < cnt; i++) {
			menu = Manage.creation();
			System.out.println(menu);
			total += menu.getCost();
		}
		System.out.println("주문합계 : "+ total);
		key.close();
	}
}
