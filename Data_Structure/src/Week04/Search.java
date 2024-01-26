package Week04;

class B{
	public static int search(int[] arr, int m, int n, int key) {
		if(m <= n) {
			int mid = (m + n)/2;
			if(key == arr[mid]) return mid;
			else if (key < arr[mid])
				return search(arr, m, mid, key);
			else
				return search(arr, mid, n, key);
		}
		/*
		while(m <= n){
		int mid = (m + n)/2;
		if()
		else if()
			n = mid - 1;
		else
			m = mid + 1;
		*/
		/*
		for(int i = m; i <= n; i++) {
			if(arr[i] == key)
				return i;
		}
		*/
		return -1;
	}
}

public class Search {
	public static void main(String[] args) {
		int[] arr = new int[1000];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10*i;
		}
		int i = B.search(arr, 0, arr.length-1, 550);
		
		for(int j = 0; j <= arr.length-1; j++) {
			if(arr[j] == 550)
				System.out.println(j);
		}
		System.out.print(i);
	}
}
