package Week09;

public class Car1 {
	int speed = 30;
	
	void getSpeed() {
		System.out.println("현재 속도는 "+ speed +"km/h ");
	}
	
	void turnLeft() {
		System.out.print("좌회전 합니다. ");
	}
	
	void turnRight() {
		System.out.print("우회전 합니다. ");
	}
	
	void accelerator() {
		System.out.println("가속 합니다.");
		for(int i = speed; i <= 250; i += 10) {
			if(speed >= 150) {
				System.out.println("break");
				break;
			}
			if (speed % 30 == 0) {
				System.out.println();
			}
			speed = i;
			System.out.print("시속 "+ speed +"km/h\t");
		}
	}
}
