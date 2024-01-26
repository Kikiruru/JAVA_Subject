package Week03;

import java.util.Scanner;

public class week03_app03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Word[] wd = new Word[7];
		String eng, kor;
		
		for(int i = 0; i < wd.length; i++) {
			System.out.print(i+1 +" : 영단어와 뜻을 입력하세요 >>>>>> ");
			eng = in.next();
			kor = in.next();
			wd[i] = new Word(eng, kor);
		}
		
		while(true) {
			System.out.println("찾고자 하는 단어를 입력하세요. 종료(f) >>");
			eng = in.next();
			
			if(eng.equals("f"))
				break;
			
			int idx = 0;
			for(int i = idx; i < wd.length; i++) {
				if(wd[i].getEng_word().equals(eng)) {
					System.out.println(wd[i].toStrig());
					idx = 1;
					break;
				}
			}
			if(idx == 0)
				System.out.println("해당 단어가 없습니다");
		}
		System.out.println("프로그램 종료");
		in.close();
	}
}
