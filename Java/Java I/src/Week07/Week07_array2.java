package Week07;
//2차원 배열 활용 
//행렬 덧셈 
public class Week07_array2 {
	public static void main(String[] args) {
		int[][] op1 = {{3,5,2},{5,8,3}};
		int[][] op2 = {{6,7,14},{8,9,1}};
		int[][] result = new int[2][3];
		
		for(int i = 0; i < op1.length; i++) {
			for(int j = 0; j < op1.length; j++) {
				result[i][j] = op1[i][j] + op2[i][j];
			}
		}
		
		System.out.println("=== 행렬 덧셈 결과 ===");
		for(int[] row : result) {
			for(int data : row)
				System.out.print(data +"\t");
			System.out.println();
		}
	}
}
