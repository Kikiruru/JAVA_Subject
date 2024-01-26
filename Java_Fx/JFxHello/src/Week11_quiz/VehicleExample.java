package Week11_quiz;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); // 자동 타입 변환
				
		vehicle.run();
		//vehicle.checkFare(); (x)
				
		Bus bus = (Bus) vehicle; // 강제 타입 변환
				
		bus.run();
		bus.checkFare(); 
	} 
}
