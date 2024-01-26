package Week09;
import java.util.Scanner;
public class Answer5 {
	public static void main(String[] args) {
		int column, row, cnt = 0;
		int[][] mat;
		Scanner in = new Scanner(System.in);
		System.out.print("행과 열크기를 입력하세요 >>>> ");
		row = in.nextInt();
		column = in.nextInt();
		
		mat = new int[row][column];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				cnt++;
				mat[i][j] = cnt;
				System.out.print(mat[i][j] +"  ");
			}
			System.out.println();
		}
		in.close();
	}
}
