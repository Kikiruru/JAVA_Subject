package Week11;

import java.util.*;

public class Act1 {
	public static void main(String[] args) {
		Random random = new Random();
		String[] words = "By doubting we come at the truth".split(" ");
		Calendar now = Calendar.getInstance();
		int num = Integer.parseInt("12345");
		for(int i = 0; i <= 3; i++) {
			System.out.println(random.nextInt(10)+1);
		}
		for(int i = 0; i < words.length; i++) {
			System.out.printf("[%d] :%s  ", i+1, words[i]);
		}
		System.out.println(now.get(Calendar.DAY_OF_MONTH)-1);
		System.out.println(num);
	}
}
