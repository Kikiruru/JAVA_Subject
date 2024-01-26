package Week10;

public class Car2 {
	Tire2 frontLeftTire = new Tire2("앞왼쪽", 6);
	Tire2 frontRightTire = new Tire2("앞오른쪽", 2);
	Tire2 backLeftTire = new Tire2("뒤왼쪽", 3);
	Tire2 backRightTire = new Tire2("뒤오른쪽", 4);
	int run() {
		if(frontLeftTire.roll()==false) { 
			stop(); 
			return 1; 
		}
		if(frontRightTire.roll()==false) {  //B
			stop(); 
			return 2; 
		}
		if(backLeftTire.roll()==false) { //B
			stop(); 
			return 3; 
		}
		if(backRightTire.roll()==false) { //B
			stop();
			return 4; 
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}