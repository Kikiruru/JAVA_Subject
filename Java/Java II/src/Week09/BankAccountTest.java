package Week09;

class BankAccount{
	private int balance; //잔액
	
	BankAccount(int cash){
		balance = cash;
	}
	
	int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	int withdraw(int amount) throws NegativeBalanceException {
		if(amount <= balance) {
			balance -= amount;
		}
		else {
			throw new NegativeBalanceException("잔고가 음수입니다.\n잔고 = "+ balance);
		}
		return balance;
	}
	
	int getBalance() {
		return balance;
	}
}

class NegativeBalanceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8286730889916077587L;

	public NegativeBalanceException(String message) {
		super(message);
	}
}

public class BankAccountTest {
	public static void main(String[] args)  {
		BankAccount ba = new BankAccount(0);
		
		try {
		System.out.print("저축 100, 잔고 = ");
		System.out.println(ba.deposit(100));
		System.out.print("저축 500, 잔고 = ");
		System.out.println(ba.deposit(500));
		System.out.print("출금 800, 잔고 = ");
		System.out.println(ba.withdraw(800));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//System.out.println("잔고 = "+ ba.getBalance());
	}
}
