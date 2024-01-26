package Week14;

import java.util.*;

public class Act8 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args){
		String[] s = {"사과", "배", "바나나"};
		ArrayList list = new ArrayList(Arrays.asList(s));
		Iterator <String> iter;
		
		list.add("포도");
		list.add(2, "자몽");
		System.out.println("----- 리스트 출력 -----");
		iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("------------------");
		
		System.out.println("인덱스 3 : "+ list.get(3));
		list.set(2, "메론");
		list.add("배");
		
		System.out.print("배가 저장된 위치 : ");
		for(int index = 0; index < list.size(); index++) {
			if(list.get(index).equals("배"))
				System.out.print(index +"번 ");
		}
		System.out.println();
		
		list.remove("바나나");
		System.out.println("----- 리스트 출력 -----");
		iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("------------------");
	}
}
