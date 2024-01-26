package Week10;

public class Student extends Subject{
	public String name;
	public int year;
	public String grade;
	
	public Student(String SubjectName, String name, int year, String grade) {
		super(SubjectName);
		this.name = name;
		this.year = year;
		this.grade = grade;
	}
}
