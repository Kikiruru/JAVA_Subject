package Week11;
import java.util.Scanner;

class Manage {
	static Scanner in = new Scanner(System.in);
	public static Product create() {
		Product p; //객체 선언 
		String pname;
		int cnt;
		pname  = sinput("제품명을 입력하세요 >> ");
		cnt = dinput("가격을 입력하세요 >> ");
		p = new Product(pname, cnt); //객체 생성 
		return p;
	}
	
	static String sinput(String prompt) {
		System.out.print(prompt);
		return in.next();
	}
	
	static int dinput(String prompt) {
		System.out.print(prompt);
		return in.nextInt();
	}
}
public class ProductExample {
	public static void main(String[] args) {
		Product p;
		p = Manage.create(); //정적 메소드 
		System.out.println(p); //p.toString() -> toString 생략 가능 
		int num = Manage.dinput("구입 개수를 입력하세요 >> ");
		System.out.println(p.getName() + "("+ num + " 개) 가격 : "+ p.calCost(num));
	}
}
