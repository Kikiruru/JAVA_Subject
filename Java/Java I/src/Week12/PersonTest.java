package Week12;

class Person{
	private String name;
	private int year;
	public Person(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}
	
	String checkMask() {
		String mask;
		switch(year%10) {
		case 1:
		case 6:
			mask = "월요일";
			break;
		case 2:
		case 7:
			mask = "화요일";
			break;
		case 3:
		case 8:
			mask = "수요일";
			break;
		case 4:
		case 9:
			mask = "목요일";
			break;
		default:
			mask = "금요일";
		}
		return mask;
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("김희수", 2000);
		Person p2 = new Person("한유남", 2012);
		
		System.out.println("Name : "+ p1.getName() +"\tYear : "+ p1.getYear() +"\tMask : "+ p1.checkMask());
		System.out.println("Name : "+ p2.getName() +"\tYear : "+ p2.getYear() +"\tMask : "+ p2.checkMask());
	}
}
