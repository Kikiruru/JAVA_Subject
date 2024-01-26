package Week10;

import java.util.Scanner;

public class Act6 {
	public static void main(String[] args) {
		String[] str1 = {"오이", "강아지", "자바", "생강", "소나기", "우동", "언어"};
		String currentStr;
		String temp;
		char play = 'c';
		Scanner in = new Scanner(System.in);
		
		System.out.println("끝말 잇기 게임을 시작합니다~~~");
		currentStr = str1[(int)(Math.random() * str1.length)];
		
		while(play == 'c' || play == 'C') {
			char last = currentStr.charAt(currentStr.length()-1);
			System.out.print(currentStr +"의 "+ last +"로 시작하는 단어 >> ");
			temp = in.next();
			if(last == temp.charAt(0)) {
				currentStr = temp;
			}
			else {
				System.out.println("틀렸습니다");
				System.out.print("계속하시겠습니까 ? >> ");
				play = in.next().charAt(0);
				currentStr = str1[(int)(Math.random() * str1.length)];
			}
		}
		System.out.println("게임을 종료 합니다");
		in.close();
	}
}
