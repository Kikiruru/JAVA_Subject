package Week07;

import java.util.Scanner;

abstract class Media{
	abstract void play(String instru);
	abstract void stop(String instru);
}

public class Answer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String instru;
		Media m = new Media() {
			public void play(String instru) {
				System.out.println(instru +"를 재생합니다.");
			}
			public void stop(String instru) {
				System.out.println(instru +"를 중지합니다.");
			}
		};
		
		System.out.println("기기를 선택하세요");
		System.out.print("1: MP3 2: CDPlay 3: WindowMediaPlay >>");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			instru = "MP3";
			break;
		case 2:
			instru = "CDPlay";
			break;
		case 3:
			instru = "WindowMediaPlay";
			break;
		default:
			instru = "NULL";	
		}
		
		m.play(instru);
		m.stop(instru);
		sc.close();
	}
}
