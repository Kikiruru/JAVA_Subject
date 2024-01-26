package Week11;
//주어진 main()을 참고하여 Car 클래스를 작성하시오 
public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(40, 100); // Car(int a, int b)
		System.out.println(">>>> 객체 생성 후 <<<<");
		System.out.println("speed : " + myCar.getSpeed() +"\tmileage : "+myCar.getMileage());
		myCar.setMileage(90);
		myCar.setSpeed(50);
		System.out.println(">>>> 필드 값 변경 후 <<<<");
		System.out.println("speed : " + myCar.getSpeed() +"\tmileage : "+myCar.getMileage());
		myCar.speedUp(20);
		myCar.addMileage(100);
		System.out.println(">>>> 필드 값 증가 후 <<<<");
		System.out.println("speed : " + myCar.getSpeed() +"\tmileage : "+myCar.getMileage());
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재 속도: " + myCar.getSpeed());
		// 올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed()); }
}