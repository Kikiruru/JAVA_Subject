package Week03;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 65;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		char charValue2 = 'A';
		int intValue2 = (int) charValue2;
		System.out.println(intValue2);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
		int intValue3 = 10;
		double doubleValue2 = (double) intValue3;
		System.out.println(doubleValue2);
	}
}
