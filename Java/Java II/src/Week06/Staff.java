package Week06;

public class Staff extends Person2 implements IJob, IPin{
	private double pay;
	private static int enter = 0; //생성순서
	
	public Staff(String name, int age, double hour) {
		super(name, age);
		enter++;
		pay = getPay(hour);
		super.num = enter * 100 + getPin();
	}
	
	public double getPay(double hour) {
		return 8000 * hour;
	}
	
	public int getPin() {
		return (int) (Math.random() * 100); // 0 ~ 99	난수
	}
	
	public String toString() {
		return "Staff [pay="+ pay +", num="+ num +"]";
	}
}
