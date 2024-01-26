package Week14;

import java.util.*;

public class Act7 {
	public static void main(String[] args) {
		Set <Integer> set = new HashSet<>();
		int randNum;
		
		while(set.size() < 10) {
			randNum = (int)(Math.random()*90 + 10); // 10 ~ 99 까지 무작위 정수 
			set.add(randNum);
		}
		
		System.out.println("두자리수 난수 10개를 출력합니다.");
		System.out.print("[");
		Iterator <Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
			if(iter.hasNext())
				System.out.print(", ");
			else
				System.out.print("]");
		}
	}
}
