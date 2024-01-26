package Week09;

public class Quiz9 {
	int sum1(int[] val) { // a
		int sum = 0;
		for(int i = 0; i < val.length; i++) { // b
			sum += val[i];
		}
		return sum;
	}
	
	int sum2(int ... val) {
		int sum = 0;
		
		for(int i = 0; i < val.length; i++) { // c
			sum += val[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Quiz9 mySum = new Quiz9();
		
		int[] v1 = {1, 3, 5};
		int result1 = mySum.sum1(v1);
		int result2 = mySum.sum1(new int[] {2, 4, 6, 8}); // d
		int result3 = mySum.sum2(1, 3, 5);
		
		System.out.println("result1="+ result1);
		System.out.println("result2="+ result2);
		System.out.println("result3="+ result3);
	}
}
