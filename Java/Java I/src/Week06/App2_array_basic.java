package Week06;
import java.util.Scanner;
/*난수로 배열 초기화
 * 단, 배열 크기는 입력받고 역순으로 출
 */
public class App2_array_basic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] digit; //배열 선언 
		int size;
		
		System.out.print("배열 크기를 입력하시오 >>");
		size = scan.nextInt();
		digit = new int[size]; //입력 받은 값만큼 배열 생성 
		
		for(int i = 0;i < digit.length; i++) {
			digit[i] = (int)(Math.random()*20)+10;
			System.out.print(digit[i] +"  ");
		}
		
		System.out.println();
		for(int i = digit.length - 1;i >= 0; i--) //마지막 원소부터 출
			System.out.print(digit[i] +"  ");
		System.out.println("\nprogram stop");
		scan.close();
	}
}
