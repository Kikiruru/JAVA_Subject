package Week09;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백", "춘천시");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		System.out.println(p1.city);
		
		p1.nation = "USA"; // 1
		//p1.ssn = "654321-7654321"; // 2
		p1.name = "Petrick"; // 3
		p1.city = "L.A"; // 4
	}
}
