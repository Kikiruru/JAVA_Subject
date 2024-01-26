package Week10;

public class KumhoTire extends Tire2 {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotation-accumulatedRotation) + "회"); //C
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***"); //C
			return false;
		}
	}
}
