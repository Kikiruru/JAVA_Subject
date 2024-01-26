package Week02;
import java.util.Scanner;

public class a4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] score = new int[100];
		int size = 0;
		int sc = in.nextInt();
		int temp = 0;
		
		while(sc > -1) { //sc에 -1보다 작은값이 들어가기 전까지 score에 값 저장
			score[size] = sc;
			size++;
			sc = in.nextInt();
		}
		
		for(int i=0; i < size; i++)
			System.out.print(score[i] +"  "); //score의 값 출력
		System.out.println();
		
		for(int i=0; i < size-1; i++) { //오름차순 정렬
			for(int j=i+1; j < size; j++) {
				if(score[i] < score[j]) {
					temp = score[j];
					score[j] = score[i];
					score[i] = temp;
				}
			}
		}
		
		for(int i=0; i < size; i++)
			System.out.print(score[i] +"  ");
		System.out.println();
		
		for(int i=0; i < size-1; i++) {
			for(int j=i+1; j < size; j++) { //내림차순 정렬
				if(score[i] > score[j]) {
					temp = score[j];
					score[j] = score[i];
					score[i] = temp;
				}
			}
		}
		
		for(int i=0; i < size; i++)
			System.out.print(score[i] +"  ");
		System.out.println();
		in.close();
	}
}
