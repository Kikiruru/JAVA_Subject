package Week05;

import java.util.Scanner;

public class Week4_Controll {
	public static void main(String[] args) {
		char plan;
		
		Scanner menu = new Scanner(System.in);
		System.out.print("오늘은 뭐 먹을까?");
		plan = menu.next().charAt(0);
		
		switch(plan) {
		case 'a':
		case 'A':
			System.out.println("치킨");
			break;
		case 'b':
		case 'B':
			System.out.println("피자");
			break;
		default:
			System.out.println("아무거나");	
		}
		
		menu.close();
	}
}
