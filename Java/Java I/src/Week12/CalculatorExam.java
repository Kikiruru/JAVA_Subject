package Week12;

class Calculator{
	static int add(int a, int b) {
		return a + b;
	}
	
	static double add(double a, double b) {
		return a + b;
	}
	
	static String add(String a, String b) {
		return a + b;
	}
	
	static int hap(int ...a	) {
		int sum = 0;
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
	
	static double max(double ...a) {
		double max = Double.MIN_VALUE;
		for(double data : a) {
			if(max < data)
				max = data;
		}
		return max;
	}
}

public class CalculatorExam {
	public static void main(String[] args) {
		System.out.println(Calculator.add(23,45));
		System.out.println(Calculator.add(3.2, 6.5));
		System.out.println(Calculator.add("java", "program"));
		System.out.println(Calculator.hap(3,4,5,6,7,1));
		System.out.println(Calculator.hap(5,3,8,5,10,11,54,28,44,71,34));
		System.out.println(Calculator.max(3.2, 6.5, 12.3, 42.1, 5.9));
	}
}
