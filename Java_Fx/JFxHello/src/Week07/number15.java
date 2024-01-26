package Week07;

public class number15 {
	public static void main(String[] args) {
		int[][] array = {{5, 34}, {6, 74, 31, 23}, {13, 21, 35, 60, 42}};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		
		avg = (double)sum/count;
		
		System.out.println("합계 : "+ sum);
		System.out.printf("평균 : %.2f", avg);
	}
}
