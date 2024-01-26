package Week5;
import java.util.Scanner;
public class Test05_2 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int data1, data2, max, min;
		
		System.out.print("두개의 정수를 입력하세요 >>");
		data1 = key.nextInt();
		data2 = key.nextInt();
		
		if(data1 > data2) {
			max = data1;
			min = data2;
		}else {
			max = data2;
			min = data1;
		}
		
		System.out.print(min +" ~ "+ max +" 사이의 짝수 : ");
		for(int i = min ; i <= max ; i++) {
			if(i%2 == 0)
				System.out.print(i +"  ");
		}
		
		System.out.print("\n"+ min +" ~ "+ max +" 사이의 홀수 : ");
		for(int i = min ; i <= max ; i++) {
			if(i%2 != 0)
				System.out.print(i +"  ");
		}
		key.close();
	}
}
