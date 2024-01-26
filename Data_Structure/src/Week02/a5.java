package Week02;
import java.util.Scanner;

public class a5 {
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int[][]	 std = new int[100][4];
			int snum = 0, msc=0, fsc=0;
			int sum = 0;
			int size = 0;
			int[] temp = new int[2];
			
			snum = in.nextInt();
			msc = in.nextInt();
			fsc = in.nextInt();
			while(snum > -1 || msc > -1 || fsc > -1) {
				sum = msc + fsc;
				std[size][0] = snum;
				std[size][1] = msc;
				std[size][2] = fsc;
				std[size][3] = sum;
				size++;
				snum = in.nextInt();
				msc = in.nextInt();
				fsc = in.nextInt();
			}
			System.out.println("�й�\t�߰�����\t�⸻����\t����");
			for(int i = 0; i < size ; i++) {
				for(int j = 0; j < 4; j++) {
					System.out.print(std[i][j] +"\t");
				}
				System.out.println();
			}
			
			for(int i=0; i < size-1; i++) {
				for(int j=i+1; j < size; j++) {
					if(std[i][3] < std[j][3]) {
						temp = std[j];
						std[j] = std[i];
						std[i] = temp;
					}
				}
			}
			
			System.out.println("�й�\t�߰�����\t�⸻����\t����");
			for(int i = 0; i < size ; i++) {
				for(int j = 0; j < 4; j++) {
					System.out.print(std[i][j] +"\t");
				}
				System.out.println();
			}
			in.close();
	}
}
