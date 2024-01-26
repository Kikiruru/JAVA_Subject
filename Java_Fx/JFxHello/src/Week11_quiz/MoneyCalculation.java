package Week11_quiz;

public class MoneyCalculation {
	Account balance1 = new deposit();
	Account balance2 = new withdraw();
	Account balance3 = new deposit();
	Account balance4 = new withdraw();
	
	void run() {
		int balance = 50000;
		System.out.println("현재 잔고 "+balance+"원");
		balance1.bank(balance, 10000);
		balance2.bank(balance, 5000);
		balance3.bank(balance, 20000);
		balance4.bank(balance, 12000);
	}
}