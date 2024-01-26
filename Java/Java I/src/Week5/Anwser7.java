package Week5;
import java.util.Scanner;
public class Anwser7 {
	public static void main(String[] args) {
		int cnt, pri;
		double pee, sale, fin;
		Scanner in = new Scanner(System.in);
		
		System.out.print("수량을 입력하세요 >>");
		cnt = in.nextInt();
		System.out.print("물건 한개의 가격을 입력하세요 >>");
		pri = in.nextInt();
		
		pee = cnt*pri;
		System.out.println("구입가격 : "+ pee);
		
		if(cnt < 10)
			sale = pee*0;
		else if(cnt < 50)
			sale = pee*3/100;
		else if(cnt < 100)
			sale = pee*5/100;
		else
			sale = pee*10/100;
		System.out.println("할인율 : "+ sale);
		fin = pee - sale;
		System.out.println("할인이 적용된 전체 가격 : "+ fin);
		in.close();
	}
}
