package Week11;

public class Calculator {
	static int add(int a, int b) {
		return a + b;
	}
	
	static double add(double a, double b) {
		return a + b;
	}
	
	static String add(String a, String b) {
		return a + b;
	}
	
	static int hap(int ...values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++)
			sum += values[i];
		return sum;
	}
	
	static double max(double ...values) {
		double max = Double.MIN_VALUE;
		for(double data : values) {
			if(max < data)
				max = data;
		}
		return max;
	}
}
