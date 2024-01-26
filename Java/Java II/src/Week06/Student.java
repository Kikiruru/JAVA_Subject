package Week06;

public class Student extends Person2 implements IJob, IPin{
	private int enter; //입학년도
	private double pay;

	public Student(String name, int age, int enter, double hour) {
		super(name, age);
		this.enter = enter;
		pay = getPay(hour);
		super.num = enter*100 + getPin();
	}
	
	public double getPay(double hour) {
		return 7000 * hour;
	}
	
	public int getPin() {
		return (int) (Math.random() * 100); // 0 ~ 99	난수
	}
	
	public String toString() {
		return "Student [enter="+ enter +", pay="+ pay +", num="+ num +"]";
	}
}
