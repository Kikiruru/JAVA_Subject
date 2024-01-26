package Week04;

import java.util.Scanner;

public class week04_app04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		Employee person=null;
		while (flag) {
			System.out.print("1: Salaried 객체 생성, 2: Hour 객체 생성 3. 종료 --> ");
			int menu = in.nextInt();

			switch (menu) {
			case 1:
				System.out.println("이름, 사번, 급여를 입력하세요");
				person = new SalariedEmployee(in.next(), in.next(), in.nextInt());
				break;
			case 2:
				System.out.println("이름, 사번, 시간당임금, 시간을 입력하세요");
				person= new HourEmployee(in.next(), in.next(), in.nextInt(), in.nextInt());
				break;
			case 3:
				flag = false;
				continue;
			default:
				System.out.println("잘못된 입력입니다");
			}
			System.out.println(person);
		}
		in.close();
		System.out.println("프로그램을 종료합니다");
	}
}
