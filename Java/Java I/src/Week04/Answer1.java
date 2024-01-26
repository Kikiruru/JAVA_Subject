package Week04;
import java.util.Scanner;
public class Answer1 {
	public static void main(String[] args) {
	int salary;
	long pay;
	Scanner input = new Scanner(System.in);
	
	System.out.print("월급을 입력하시오: ");
	salary = input.nextInt();
	pay = salary * 12;

	System.out.println("월급 : "+ salary +"\n연봉 : "+ pay);
	input.close();
	}
}
