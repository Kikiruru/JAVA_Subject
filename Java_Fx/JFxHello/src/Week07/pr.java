package Week07;

import java.util.*;

public class pr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 음식 개수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String[] sArr = new String[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print(i+1 +") ");
			sArr[i] = sc.next();
		}
		
		System.out.print("내가 좋아하는 음식은? ( ");
		for(String s : sArr) { //밑줄
			System.out.print(s + " ");
		}
		System.out.println(")등이 있습니다.");
		sc.close();
	}
}
