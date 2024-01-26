package Week14;

import java.util.*;

class Person {
	private String name; //이름
	private String num;  //전화번호
	public Person(String name, String num){
		this.name=name;
		this.num=num;
	}
	public String toString(){
		return  " [이름 : " + name + ",  전화번호 : " + num +"]" ;
	}

}

public class Act10 {
	public static void main(String[] args) {
		Map <String, Person> map = new HashMap<>(); // id, Person
		Scanner sc = new Scanner(System.in);
		String id;
		
		map.put("abcd123", new Person("김대성", "010-1234-5678"));
		map.put("abcd456", new Person("이대성", "010-5678-1234"));
		map.put("abcd789", new Person("황대성", "010-1111-2222"));
		
		System.out.print("아이디 입력 : ");
		id = sc.next();
		
		System.out.println("해당 아이디 정보");
		System.out.println(map.get(id));
		
		System.out.println("모든 아이디별 사람정보");
		for(Map.Entry<String, Person> entry : map.entrySet()) {
			System.out.println(entry);
		}
		sc.close();
	}
}
