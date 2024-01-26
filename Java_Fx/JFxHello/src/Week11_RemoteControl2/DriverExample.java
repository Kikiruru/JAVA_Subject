package Week11_RemoteControl2;

interface Vehicle {
	public void run();
}

class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}

class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		driver.drive(bus);
	}
}