package Week06;

public class Person2 {
	private String name;
	private int age;
	protected int num; //나이, 학번(사번)
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Person [name="+ name +", age="+ age +"]";
	}
}
