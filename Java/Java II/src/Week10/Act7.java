package Week10;

import java.util.Scanner;

public class Act7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] hexa2bin = {"0000", "0001", "0010", "0011", "0100", "0101", "0110",
				"0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		String play;
		
		while(true) {
			System.out.print("반복문을 종료하려면 s 또는 S를 입력하세요 :");
			play = in.next();
			
			if(play.length() <= 1 && (play.charAt(0) == 'S' || play.charAt(0) == 's')) {
				break;
			}
			
			for(int i = 0; i < play.length(); i++) {
				int index;
				if(play.charAt(i) >= '0' && play.charAt(i) <= '9')
					index = Character.getNumericValue(play.charAt(i));
				else {
					switch(play.charAt(i)) {
					case 'a':
					case 'A':
						index = 10;
						break;
					case 'b':
					case 'B':
						index = 11;
						break;
					case 'c':
					case 'C':
						index = 12;
						break;
					case 'd':
					case 'D':
						index = 13;
						break;
					case 'e':
					case 'E':
						index = 14;
						break;
					case 'f':
					case 'F':
						index = 15;
						break;
					default:
						index = -1;
						break;
					}
				}
				if(index >= 0 && index < hexa2bin.length) {
					System.out.print(hexa2bin[index] +" ");
				}
				else
					System.out.print("---- ");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		in.close();
	}
}
