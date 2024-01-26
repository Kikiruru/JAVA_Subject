package Week07;

import java.util.Arrays;

public class quiz11 {
	public static void main(String[] args) {
		int[] w = {2, 3, 5, 7, 11, 13};
		for(int i = 0; i < w.length; i++) { // 빈칸
			w[i] *= 2; // 빈칸
		}
		System.out.println(Arrays.toString(w)); //[4, 6, 10, 14, 22, 26]
	}
}
