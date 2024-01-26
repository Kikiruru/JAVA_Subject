package Week10;

import java.util.Scanner;

public class Number1 { // [1]
	public static void main(String[] args) {
		SelectNumber sn = new SelectNumber("프로그래밍 스튜디오", 2519);
		int choice;
		Scanner in = new Scanner(System.in);
		sn.connect();
		while(true) {
			System.out.println("\n1.과목 정보  2. 과목 공지  3. 로그아웃");
			System.out.print("번호를 선택해주세요. : ");
			choice = in.nextInt();
		
			if(choice == 1) {
				sn.select1(choice);
				System.out.println("과목명: " + sn.name);
				System.out.println("강의실: " + sn.place);
			}else if(choice == 2) {
				sn.select2(choice);
				sn.notice("오늘 강의 휴강입니다.");
			}else {
				sn.disconnect();
				break;
			}
		}
		in.close();
	}
}
