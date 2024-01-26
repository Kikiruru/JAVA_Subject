package Week07;

class Calculator{
	Control cal;
	
	void setControl(Control c) {
		cal = c;
	}
	
	void compute(int a, int b) {
		cal.run(a, b);
	}
	
	static interface Control{
		void run(int a, int b);
	}
}

class Add implements Calculator.Control{
	public void run(int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b, a + b);
	}
}

class Exp implements Calculator.Control{
	public void run(int a, int b) {
		int result = a;
		for(int i = 1; i < b; i++) {
			result *= a;
		}
		System.out.printf("%d ** %d = %d\n", a, b, result);
	}
}

public class Answer5 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.setControl(new Add());
		cal.compute((int)(Math.random()*10) + 1, (int)(Math.random()*10) + 1);
		cal.setControl(new Exp());
		cal.compute(5, 3);
	}
}
