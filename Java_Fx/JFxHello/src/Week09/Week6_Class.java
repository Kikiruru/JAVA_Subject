package Week09;

public class Week6_Class {
	public static void main(String[] args) {
		Car1 myCar = new Car1();
		
		System.out.println("주행을 시작합니다.");
		myCar.getSpeed();
		myCar.turnLeft();
		myCar.turnRight();
		myCar.accelerator();
		myCar.getSpeed();
	}
}
