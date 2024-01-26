package Week05;

public class WhileSumFormExample {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			if(sum % 2 == 0)
				i += 3;
		}
		System.out.println("합: "+ sum);
	}
}
