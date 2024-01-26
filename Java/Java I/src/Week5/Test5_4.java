package Week5;
import java.util.Scanner;
public class Test5_4 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int data, i = 1;
	
	do {
	System.out.print("1~100까지의 정수를 입력하세요 : ");
	data = in.nextInt();
	}while(data > 100 || data < 1);
	
	System.out.print(data +"의 약수는 : ");
	do {
		if(data%i == 0)
			System.out.print(i +"  ");
		i++;
	}while(i <= data);
	
	System.out.print("입니다.");
	in.close();
	}
}
