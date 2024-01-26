package Week12;

class Account {
	private String acNumber; //계좌번호
	private String owner; //예금주
	private int balance; //잔액
	
	public Account(String ac, String ow, int ba) {
		acNumber = ac;
		owner = ow;
		balance = ba;
	}
	
	void deposit(int amount) { //예금
		balance += amount;
	}
	
	int withdraw(int amount) { //인출
		if(amount > balance)
			System.out.println((amount - balance)+ "만큼 잔액 부족");
		else
			balance -= amount;
		return amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	void disPlay() {
		System.out.println("계좌번호 : "+ acNumber);
		System.out.println("예금주 : "+ owner);
		System.out.println("잔액 : "+ balance);
	}
}

class CheckingAccount extends Account{
	private String cardNo; //추가된 필드, 직불 카드 번호
	
	public CheckingAccount(String ac, String ow, int bc, String ca) {
		super(ac, ow, bc);
		cardNo = ca;
	}
	
	int pay(String cardNo, int amount) { //추가된 메소드, 사용액 지불
		if(!cardNo.equals(this.cardNo) || (getBalance() < amount)) {
			System.out.println("지불이 불가능합니다.");
			return amount;
		}
		else
			return withdraw(amount); // 수퍼 클래스 메소드 호출
	}
	
	void write() {
		disPlay();
		System.out.println("카드번호 : "+ cardNo);
	}
}

public class AccountApp {
	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount("111-22-3333", "홍길동", 100000, "55-66-77-88");
		
		System.out.println(">> 예금 전 <<");
		obj.write();
		
		System.out.println(">> 예금 후 <<");
		obj.deposit(100000); // 상속 받은 메소드 호출
		obj.write();
		
		int paidAmount = obj.pay("55-66-77-88", 40000);
		System.out.println(">> 직불 카드 사용 후 <<");
		obj.write();
	}
}
