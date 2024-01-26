package Week09;

public class Answer2 {
	public static void main(String[] args) {
		int[][] arr = new int[5][]; // 비정형 배열 생성 
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[arr.length-i]; // 비정형 배열의 열에 행 생성 
			for(int j = 0; j < arr[i].length; j++) {
				cnt++;
				arr[i][j] = cnt;
			}
		}
		
		for(int[] row : arr) {
			for(int data : row) {
				System.out.print(data +"\t");
			}
			System.out.println();
		}
	}
}
