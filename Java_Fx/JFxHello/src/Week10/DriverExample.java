package Week10;

class Vehicle {
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}

class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 도착합니다.");
	}
}

class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 도착합니다.");
	}
}

class Flight extends Vehicle {
	@Override
	public void run() {
		System.out.println("비행기가 도착합니다.");
	}
}

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();

		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Flight flight = new Flight();

		driver.drive(bus); //a
		driver.drive(taxi); //b
		driver.drive(flight); //c
		driver.drive(vehicle); //d
	}
}
