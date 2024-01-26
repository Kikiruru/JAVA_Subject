package Week14;

import java.util.*;

class Count {	
	@SuppressWarnings("rawtypes")
	public static Map count() {
		Map <Integer, Integer> map = new HashMap<>(); // 주사위 눈, 값 (key, value)
		// 주사위 값 초기화 
		map.put(1, 0);
		map.put(2, 0);
		map.put(3, 0);
		map.put(4, 0);
		map.put(5, 0);
		map.put(6, 0);
		
		int number = 0;
		for(int i = 0; i < 100; i++) {
			number = (int)(Math.random() * 6 + 1);
			map.put(number, map.get(number) + 1);
		}
		return map;
	}
	
	public static void write(Map <Integer, Integer> map) {
		map.forEach((Integer key, Integer value) -> {
			System.out.println("주사위 눈 = "+ key +", 빈도수 = "+ value);
		});
	}
}

public class Act9 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Map <Integer, Integer> map;
	    map = Count.count();  //빈도수를 계산한 HashMap을 반환받아 저장
	    System.out.println("Map에 저장된 빈도수를 출력합니다");
	    Count.write(map);  //HashMap에 저장된 원소 출력
	}
}
