package Week14;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		List <Double> list = new ArrayList<Double>();
		
		
		list.add(5.5);
		list.add(12.8);
		list.add(9.906);
			
		System.out.println("---for---");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) +" ");
		}
		System.out.println();
		
		System.out.println("---for each---");
		for(Double li : list) {
			System.out.print(li +" ");
		}
		System.out.println();
		
		System.out.println("---iterator---");
		Iterator <Double> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() +" ");
		}
		/*
		for(Iterator <Double> iter2 = list.iterator(); iter2.hasNext();) {
			System.out.print(iter2.next() +" ");
		}
		*/
	}
}
