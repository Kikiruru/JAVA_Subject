package Week09;

public class Answer3 {
	public static void main(String[] args) {
		int[] arr = new int[7];
		int max = 0, min = 100, indexMax = 0, indexMin = 0;
		
		System.out.println("----------배열 원소 출력----------");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*99)+1;
			if(arr[i] > max) {
				max = arr[i];
				indexMax = i+1;
			}
			if(arr[i] < min) {
				min = arr[i];
				indexMin = i+1;
			}
			System.out.print(arr[i] +"  ");
		}
		
		System.out.println("\n----------최대 & 최소 출력----------");
		System.out.println("max : "+ max +" \tindex = "+ indexMax);
		System.out.println("min : "+ min +" \tindex = "+ indexMin);
	}
}
