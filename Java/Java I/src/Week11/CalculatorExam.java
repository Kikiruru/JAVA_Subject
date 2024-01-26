package Week11;
// 주어진 main()을 참고하여 Calculator클래스를 작성하시오
public class CalculatorExam {
	public static void main(String[] args) {
		System.out.println(Calculator.add(23, 45));
		System.out.println(Calculator.add(3.2, 6.5));
		System.out.println(Calculator.add("java", "program"));
		System.out.println(Calculator.hap(3, 4, 5, 6, 7, 1));
		System.out.println(Calculator.hap(5, 3, 8, 5, 10, 11, 54, 28, 44, 71, 34));
		System.out.println(Calculator.max(3.2, 6.5, 12.3, 42.1, 5.9));
		//객체 생성X -> add, hap, max : 정적 메소드 
	}
}
