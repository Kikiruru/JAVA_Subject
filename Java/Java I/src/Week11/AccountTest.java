package Week11;
import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Account a = new Account();
		
		a.ac = "243-54-654876";
		a.left = 10000;
		
		System.out.println("Account [계좌번호="+ a.ac +", 잔액="+ a.left +"]");
		System.out.print("입금액 >> ");
		a.deposit(key.nextInt());
		System.out.println("Account [계좌번호="+ a.ac +", 잔액="+ a.left +"]");
		System.out.print("출금액 >> ");
		if(a.pay(key.nextInt()))
			System.out.println("Account [계좌번호="+ a.ac +", 잔액="+ a.left +"]");
		else
			System.out.println("잔액부족");
		System.out.println("프로그램을 종료합니다");
		key.close();
	}
}
