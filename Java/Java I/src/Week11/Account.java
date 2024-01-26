package Week11;

public class Account {
	String ac; // 계좌번호
	int left; // 잔액
	
	public void deposit(int money) {
		left += money;
	}
	
	public boolean pay(int money) {
		if (left < money)
			return false;
		else {
			left -= money;
			return true;
		}
	}
}
