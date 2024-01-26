package Week09;

public class ex16 {
	public static void main(String[] args) {
		ex16_cal myCalc = new ex16_cal();
		myCalc.powerOn();
		
		int result1 = myCalc.divide(5, 6); // A
		System.out.println("result1: "+ result1);
		
		byte x = 10; // B
		byte y = 4; // C
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: "+ result2);
		myCalc.powerOff();
	}
}
