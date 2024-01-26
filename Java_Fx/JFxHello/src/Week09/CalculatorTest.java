package Week09;

class Calculator{
	public double mul(double num, char square) {
		int squared = square - 48;
		
		if(num == 0) return 0;
		if(square == 0) return 1;
		
		double result = 1;
		
		for(int i = 0; i < squared; i++)
			result *= num;
		
		System.out.print(num +" ** "+ squared +" = ");
		return result;
	}
	
	public double mul(double num1, double num2) {
		System.out.print(num1 +" * "+ num2 +" = ");
		return num1 * num2;
	}
}

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		System.out.print(c.mul(2, 5)+ ", ");
		System.out.print(c.mul(2, '5'));
	}
}
