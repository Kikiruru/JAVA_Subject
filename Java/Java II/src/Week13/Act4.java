package Week13;

final class MyAlgorithm2 {
	public static <T> void swap(T[] a, int i, int j) { //a[i]와 a[j]를 서로 교환
		T temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}	
}


public class Act4 {
	public static void main(String[] args) {
		Integer[] a = {10, 20, 30, 40, 50};
		
		for(int i : a) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		MyAlgorithm2.swap(a, 0, 3);
		
		for(int i : a) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
}
