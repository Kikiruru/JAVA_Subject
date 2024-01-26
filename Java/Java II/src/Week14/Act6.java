package Week14;

import java.util.*;

class Student {
	String name, number;
	
	Student(String name, String number){
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString() {
		return "name : "+ name +", number : "+ number;
	}
}

public class Act6{
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		String name; 
		
		for(int i=0;i<10; i++){
			list.add(new Student("name"+i, "phone"+i));
		}
		for(Student s : list)
			System.out.println(s);

		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		for(Student std : list) {
			if(std.getName().equals(name))
				System.out.print("number : "+ std.getNumber());
		}
		System.out.println();

		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		int i = 0;
		for(Student std : list) {
			if(std.getName().equals(name))
				break;
			i++;
		}
		list.remove(i);
		
		for(Student s : list)
			System.out.println(s);
		
		sc.close();
	}
}
