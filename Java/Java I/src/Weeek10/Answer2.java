package Weeek10;

public class Answer2 {
	public static void main(String[] args) {
		int[] digit = new int[] {3, 12, 6, 21, 7, 38, 20};
		int[] dim = {4, 7, 9, 11, 6, 9, 31, 28, 31, 60, 41, 71};
		System.out.println("배열 digit 합 = "+ sum_array(digit));
		System.out.println("배열 dim 합 = "+ sum_array(dim));
	}
	
	public static int sum_array(int[] arr) {
		int cnt = 0;
		for(int i = 0; i < arr.length; i++)
			cnt += arr[i];
		return cnt;
	}
}