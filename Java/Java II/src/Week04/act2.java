package Week04;

class Account {
	public String accountNumber;
	public String name;
	public int cash;
	
	public Account() {
		accountNumber = "111-11-1111";
		name = "홍길동";
		cash = 0;
		
		System.out.println(">> 예금 전 <<");
		System.out.println("계좌번호 : "+ accountNumber);
		System.out.println("예금주 : "+ name);
		System.out.println("잔액 : "+ cash);
	}
	
	public Account(String an, String n, int ca) {
		accountNumber = an;
		name = n;
		cash = ca;
		
		System.out.println(">> 예금 전 <<");
		System.out.println("계좌번호 : "+ accountNumber);
		System.out.println("예금주 : "+ name);
		System.out.println("잔액 : "+ cash);
	}
	
	public void deposit(int ca) { //예금
		cash += ca;
		
		System.out.println(">> 예금 후 <<");
		System.out.println("계좌번호 : "+ accountNumber);
		System.out.println("예금주 : "+ name);
		System.out.println("잔액 : "+ cash);
	}
	
	public void withdraw(int ca) { //출금
		cash -= ca;
		
		System.out.println(">> 출금 후 <<");
		System.out.println("계좌번호 : "+ accountNumber);
		System.out.println("예금주 : "+ name);
		System.out.println("잔액 : "+ cash);
	}
}

class CheckingAccount extends Account{
	private String cardNo;
	
	CheckingAccount(){
		super();
		cardNo = "11-11-11-11";
		
		System.out.println("카드번호 : "+ cardNo);
	}
	
	CheckingAccount(String accountNumber, String name, int cash, String cardNo) {
		super(accountNumber, name, cash);
		this.cardNo = cardNo;
		
		System.out.println("카드번호 : "+ cardNo);
	}
	
	@Override
	public void deposit(int ca) {
		super.deposit(ca);
		
		System.out.println("카드번호 : "+ cardNo);
	}
	
	@Override
	public void withdraw(int ca) {
		super.withdraw(ca);
		
		System.out.println("카드번호 : "+ cardNo);
	}
	
	public void pay(int ca) {
		cash -= ca;
		
		System.out.println(">> 직불카드 사용 후 <<");
		System.out.println("계좌번호 : "+ accountNumber);
		System.out.println("예금주 : "+ name);
		System.out.println("잔액 : "+ cash);
		System.out.println("카드번호 : "+ cardNo);
	}
}

public class act2 {
	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount("123-45-6789", "김대성", 10000, "12-34-56-78");
		
		ca.deposit(10000);
		ca.withdraw(5000);
		ca.pay(5000);
	}
}
