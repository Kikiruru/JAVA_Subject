package Week11_quiz;

public class MoneyTest {
	public static void main(String[] args) {
		MoneyCalculation mc = new MoneyCalculation();
		mc.balance2 = new deposit(); //a b
		mc.balance3 = new withdraw(); //c d
		mc.run();
	}
}
