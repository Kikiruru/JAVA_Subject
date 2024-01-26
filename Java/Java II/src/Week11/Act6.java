package Week11;

import java.util.Arrays;

@SuppressWarnings("rawtypes")
class Person implements Comparable{
	private String name;
	private double height;
	
	public String toString() {
		return "Person [name="+ name +", height="+ height +"]";
	}
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
	@Override
	public int compareTo(Object other) {
		
		if(other instanceof Person) {
			Person p = (Person) other;
			if(p.height < this.height)
				return 1; // 비교대상보다 크면 1
			else if(p.height > this.height)
				return -1; // 더 작으면 -1
			else
				return 0; // 같으면 0
		}
		else
			return 100;
	}
}

public class Act6 {
	public static void main(String[] args) {
		Person[] p = {
				new Person("홍릉", 180.0),
				new Person("용원", 168.0),
				new Person("인성", 175.0),
				new Person("성우", 170.0)
		};
		System.out.println("==== 정렬 전 데이터 ====");
		for(Person t : p)
			System.out.println(t);
		
		Arrays.sort(p);
		
		System.out.println("==== 정렬 후 데이터 ====");
		for(Person t : p)
			System.out.println(t);
	}
}
