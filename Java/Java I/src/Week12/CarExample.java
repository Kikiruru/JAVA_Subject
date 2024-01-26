package Week12;

class Car{
	private int speed, mileage;
	
	public Car(int speed, int mileage) {
		this.speed = speed;
		this.mileage = mileage;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0)
			this.speed = 0;
		else
			this.speed = speed;
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void addMileage(int mileage) {
		this.mileage += mileage;
	}
}

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(40, 100);
		System.out.println(">>>> 객체 생성 후 <<<<");
		System.out.println("speed : "+ myCar.getSpeed() + "\tmileage : "+ myCar.getMileage());
		myCar.setMileage(90);
		myCar.setSpeed(50);
		System.out.println(">>>> 필드 값 변경 후 <<<<");
		System.out.println("speed : "+ myCar.getSpeed() +"\tmileage : "+ myCar.getMileage());
		myCar.speedUp(20);
		myCar.addMileage(100);
		System.out.println(">>>> 필드 값 증가 후 <<<<");
		System.out.println("speed : "+ myCar.getSpeed() +"\tmileage : "+ myCar.getMileage());
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재 속도: "+ myCar.getSpeed());
		// 올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도: "+ myCar.getSpeed()	);
	}
}
