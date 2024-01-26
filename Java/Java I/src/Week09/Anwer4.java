package Week09;
import java.util.Scanner;
public class Anwer4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] hexa2bin = {"0000", "0001", "0010", "0011", "0100",
				"0101", "0110", "0111", "1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111"};
		char ch = 'a';
		int data = 0;
		
		while(ch != 's' && ch != 'S'){ //true
			System.out.println("16진수 한 개를 입력하세요");
			System.out.print("반복문을 종료하려면 s 또는 S를 입력하세요 :");
			ch = in.next().charAt(0);
			if(ch == 's' || ch == 'S')
				continue; //break;
			if(ch >= '0' && ch <= '9')
				data = (int)ch - 48; // ch - '0'도 같은 결과 
			else if(ch >= 'A' && ch <= 'F')
				data = (int)ch - 55;
			else if(ch >= 'a' && ch <= 'f')
				data = (int)ch - 87; // 10+(ch-'a')
			else {
				System.out.println("16진수가 아닙니다\n");
				continue;
			}
			System.out.println("16진수 "+ ch +"는 이진수로 "+ hexa2bin[data] +" 입니다\n");
		}
		System.out.println("프로그램 종료");
		in.close();
	}
}
