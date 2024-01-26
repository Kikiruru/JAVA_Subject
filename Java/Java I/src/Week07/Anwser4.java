package Week07;
import java.util.Scanner;
public class Anwser4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row, column;
		
		System.out.print("행과 열크기를 입력하세요 >> ");
		row = in.nextInt();
		column = in.nextInt();
		
		for(int i=0; i<row; i++) {
			for(int j=1; j<=column; j++) {
				System.out.print(j+i +"  ");
			}
			System.out.println();
		}
		in.close();
	}
}
