package Week07;

@FunctionalInterface
interface Func1{
	int calc(int a, int b);
}

public class Answer4 {
	public static void main(String[] args) {
		int x, y;
		Func1 sub = (a, b) -> a - b;
		Func1 plus = (a, b) -> a + b;
		Func1 mul = (a, b) -> a * b;
		Func1 squr = (a, b) -> {
			int result = a;
			for(int i = 1; i < b; i++) {
				result *= a;
			}
			return result;
		};
		
		x = (int)(Math.random()*10) + 1;
		y = (int)(Math.random()*10) + 1;
		System.out.printf("result >> %d+%d=%d\n", x, y, plus.calc(x, y));
		x = (int)(Math.random()*10) + 1;
		y = (int)(Math.random()*10) + 1;
		System.out.printf("result >> %d-%d=%d\n", x, y, sub.calc(x, y));
		x = (int)(Math.random()*10) + 1;
		y = (int)(Math.random()*10) + 1;
		System.out.printf("result >> %d*%d=%d\n", x, y, mul.calc(x, y));
		x = (int)(Math.random()*10) + 1;
		y = (int)(Math.random()*10) + 1;
		System.out.printf("result >> %d**%d=%d\n", x, y, squr.calc(x, y));
	}
}
