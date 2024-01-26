package Week11_quiz;

interface Tire {
	 public void roll(); 
}

class HankookTire implements Tire { //ㄱ
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}
class KumhoTire implements Tire { //ㄱ
	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}
class Car {
	Tire frontLeftTire = new HankookTire(); //ㄴ
	Tire frontRightTire = new HankookTire(); //ㄴ
	Tire backLeftTire = new HankookTire(); //ㄴ
	Tire backRightTire = new HankookTire(); //ㄴ
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); //ㄷ

		myCar.frontLeftTire = new KumhoTire(); 
		myCar.frontRightTire = new KumhoTire();
		myCar.run();
	}
}
