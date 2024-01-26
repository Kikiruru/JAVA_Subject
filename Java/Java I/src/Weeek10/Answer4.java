package Weeek10;

public class Answer4 {
	public static void main(String[] args) {
		int[] isource = {21, 34, 76, 38, 11, 8, 56, 98, 64};
		int m = max(isource);
		System.out.println("MAX = "+ m);
	}
	
	public static int max(int[] arr) {
		int big = arr[0];
		for(int i = 1; i < arr.length; i++)
			big = (big > arr[i]) ? big : arr[i];
		return big;
	}
}
