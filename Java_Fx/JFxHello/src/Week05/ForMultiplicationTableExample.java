package Week05;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		int m = 1; do {
			System.out.println("*** "+ m +"단 ***");
			for(int n=1; n <= 9; n++) {
				System.out.println(m+"x"+n+"="+ m*n);
			}
			m++;
		} while(m < 10);
	}
}
