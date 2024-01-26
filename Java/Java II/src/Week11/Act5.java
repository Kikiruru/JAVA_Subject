package Week11;

import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;

public class Act5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String text = in.nextLine();
		StringTokenizer st = new StringTokenizer(text, " ");
		String[] words = new String[st.countTokens()];
		
		System.out.println("정렬 전 결과 :");
		for(int i = 0; i < words.length; i++) {
			words[i] = st.nextToken();
			System.out.print(words[i] +"  ");
		}
		System.out.println();
		System.out.println("정렬 후 결과 :");
		Arrays.sort(words);
		for(String k : words) {
			System.out.print(k + "  ");
		}
		
		in.close();
	}
}
