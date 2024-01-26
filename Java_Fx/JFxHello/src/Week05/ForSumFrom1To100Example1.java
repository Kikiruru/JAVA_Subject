package Week05;

public class ForSumFrom1To100Example1 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합 : "+ sum);
		
		sum = 0;
		
		for(int i = 100; i >= 0; i--) {
			sum += i;
		}
		
		System.out.println("1~100 합 : "+ sum);
		
		sum = 0;
		
		for(int i = 0; i <= 100; i+=10) {
			for(int j = 0; j < 10; j++) {
				//System.out.print("("+ i +", "+ j +")");
				//System.out.print(i + j +", ");
				sum += i + j;
			}
			//System.out.println();
		}
		
		System.out.println("1~100 합 : "+ sum);
		
		sum = 0;
		
		for(int i = 91; i > 0; i-=10) {
			for(int j = 0; j < 10; j++) {
				//System.out.print("("+ i +", "+ j +")");
				//System.out.print(i + j +", ");
				sum += i + j;
			}
			//System.out.println();
		}
		
		System.out.println("1~100 합 : "+ sum);
		
		sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합 : "+ sum);
	}
}
