package Week13;

class Student{
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "[name="+ name +"]";
	}
}

class MyPair <T>{
	T t1, t2;
	
	public MyPair(T t1, T t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public String toString() {
		return "value1 : "+ t1 +"\tvalue2 : "+ t2;
	}
}

public class Act8{
	public static void main(String[] args){
		MyPair<String> fruit = new MyPair<>("사과", "포도");
		MyPair<Student> number = new MyPair<>(new Student("hallym"), new Student("software"));
		
		System.out.println(fruit);
		System.out.println(number);
	}
}

