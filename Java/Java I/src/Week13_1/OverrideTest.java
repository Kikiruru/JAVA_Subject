package Week13_1;
import java.util.Scanner;
public class OverrideTest {
	public static void main(String[] args) {
		Circle obj = null; //지역변수 초기화
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("1) circle    s2) ball   3) cylinder    4) stop	>> ");
			int menu = in.nextInt();
			if(menu == 4)
				break;
			System.out.print("반지름 입력 >> ");
			double r = in.nextDouble();
			switch(menu) {
			case 1:
				obj = new Circle(r);
				break;
			case 2:
				obj = new Ball(r);
				break;
			case 3:
				System.out.print("높이 입력 >> ");
				double h = in.nextDouble();
				obj = new Cylinder(r, h);
				break;
			default:
				System.out.println("해당사항 없음");
			}
			obj.write();
		}
		System.out.println("프로그램을 종료합니다");
		in.close();
	}
}
