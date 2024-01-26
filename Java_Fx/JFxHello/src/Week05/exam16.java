package Week05;

import java.util.Scanner;

public class exam16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean state = true;
		
		while(state) {
			System.out.println("검색할 값을 입력하세요 (강의, 과제, 퀴즈, 끝) : ");
			String res = sc.next();
			switch(res) {
			case "강의":
				System.out.println("강의를 재생합니다.");
				break;
			case "과제":
				System.out.println("과제를 합니다.");
				break;
			case "퀴즈":
				System.out.println("퀴즈를 풉니다.");
				break;
			case "끝":
				System.out.println("끝났습니다~ 쉬세요");
				state = false;
				break;
			default:
				System.out.println("제대로 입력해주세요.");
				break;
			}
		}
		sc.close();
	}
}
