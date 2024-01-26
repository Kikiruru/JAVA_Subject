package Week06;

public class Person implements IComparable{
	private String name;
	private float height;
	
	public Person(String name, float height) {
		this.name = name;
		this.height = height;
	}
	
	public int compareTo(Object other) {
		if(other instanceof Person) 
		{
			Person p = (Person)other;
			if(height > p.height)
				return 1;
			else if(height < p.height)
				return -1;
			else
				return 0;
		}
		else {
			System.out.println("잘못된 객체 대입");
			return 100;
		}
	}
	
	public String toString() {
		 return "Person [name="+ name +", height="+ height +"]";
	}
}
