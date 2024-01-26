package Week11_quiz;

public class deposit implements Account {
	@Override
	public void bank (int balance, int money) {
		balance += money;
		System.out.println("\n"+money+"원 입금되었습니다.");
		System.out.println("계좌에 남은 잔고는 "+balance+"원 입니다.");
	}
}