package Week5;
import java.util.Scanner;
/*
 * do~while와 for 반복문 
 * 사용자로부터 10이상 100이하의 정수를 입력 받고 약수를 출력하는 프로그램을 작성하세요 
 */
public class App03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int data;
		do {
			System.out.print("input(10~100) >> ");
			data = in.nextInt();
		}while(data > 100 || data < 10);
		
		for(int i = 1; i <= data; i++) {
			if(data % i == 0)
				System.out.print(i + "  ");
		}
		System.out.println("\n프로그램 종료");
		in.close();
	}
}
