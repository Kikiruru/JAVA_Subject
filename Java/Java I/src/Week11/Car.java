package Week11;

public class Car {
	//필드
	private int speed, mileage;
	
	public Car(int speed, int mileage) {
		this.speed = speed;
		this.mileage = mileage;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return; //제어 반환 (호출된 곳으로 제어(실행순서)를 다시 돌려준다)
		} else {
			this.speed = speed;
		}
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
		return;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
		return;
	}
	
	public void addMileage(int mileage) {
		this.mileage += mileage;
		return;
	}
}
