package Week11;
import java.util.Scanner;
public class ProductTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Product p = new Product("식빵", 5000);
		Product p2 = new Product("피자", 15000);
		int pri, pri2;
		p.write();
		System.out.print(p.name +"의 구매 갯수 >> ");
		pri = p.calCost(in.nextInt());
		p2.write();
		System.out.print(p2.name +"의 구매 갯수 >> ");
		pri2 = p2.calCost(in.nextInt());
		
		System.out.println("총 내야할 금액 : "+ (pri + pri2));
		in.close();
	}
}
