package Week12;

class Man{
	protected String name;
	public Man() {
		System.out.println("부모 클래스 디폴트 생성자");
	}
	public Man(String name) {
		this.name = name;
		System.out.println("Man Class 생성자");
	}
}

class Student extends Man {
	private String major;
	private int number;
	public Student() {
		System.out.println("자식 클래스 디폴트 생성자");
	}
	public Student(String name, String major, int number) {
		super(name); //상위 클래스 생성자 호출, 자식클래스 생성자에서 가장 먼저 사용해야 함(오류 발생)
		// super.name = name; 부모 클래스에 있는 코드 중복(재사용) -> 상속의 목적에 적합하지 않다.
		this.major = major;
		this.number = number;
		System.out.println("Student Class 생성자");
	}
	public void studentInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("전공 : "+ major);
		System.out.println("학번 : "+	 number);
	}
}

public class StudentClass {
	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student("java", "소프트웨어융합", 2021);
		std1.studentInfo();
		std2.studentInfo();
	}
}
