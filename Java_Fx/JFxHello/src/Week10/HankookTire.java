package Week10;

public class HankookTire extends Tire2{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+ " HankookTire 수명: " + (maxRotation-accumulatedRotation) + "회"); //C
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***"); //C
			return false;
		}
	}
}
