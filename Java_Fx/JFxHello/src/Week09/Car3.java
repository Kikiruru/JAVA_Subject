package Week09;

public class Car3 {
	String model;
	int speed;
	
	Car3(String model){
		this.model = model; // a
	}
	
	void setSpeed(int speed) {
		this.speed = speed;	// b
	}
	
	void run() {
		for(int i = 10; i <= 50; i += 10) {
			setSpeed(i); // c
			System.out.println(this.model +"가 달립니다.(시속:"+ this.speed +"km/h)"); // a, b
		}
	}
}
