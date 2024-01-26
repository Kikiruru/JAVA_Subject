package Week10;

import java.util.Scanner;

public class Act5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder str;
		
		while(true) {
			System.out.print("문자열 입력 : ");
			str = new StringBuilder(in.next());
			
			if(str.toString().equalsIgnoreCase("finish")) {
				break;
			}
			
			System.out.print(str +" => (reverse) ");
			/*
			for(int i = str.length()-1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
			*/
			System.out.print(str.reverse());
			System.out.println();
		}
		System.out.println("프로그램 종료");
		in.close();
	}
}
