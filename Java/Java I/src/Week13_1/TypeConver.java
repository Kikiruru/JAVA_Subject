package Week13_1;

class Vehicle{
	public void run() {
		System.out.println("차량이 달립니다");
	}
}

class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}
	public void busType() {
		System.out.println("저상 버스 입니다");
	}
}

class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다");
	}
}

class Drive{
	public void drive(Vehicle vh) { //매개변수 다형성 -> 중복 작업 제거
		//인수와 매개변수의 타입을 일치시켜야 함
		vh.run();
		if(vh instanceof Bus) //true of false 반환
			((Bus)vh).busType(); //강제 타입변환
		//.연산자가 우선순위가 더 높아서 ((Bus)vh)로 사용하여 한다. vh의 타입을 Bus로 바꾸는 것이기 때문
	}
}

public class TypeConver {
	public static void main(String[] args) {
		Drive d = new Drive();
		d.drive(new Vehicle());
		d.drive(new Bus());
		d.drive(new Taxi());
	}
}
