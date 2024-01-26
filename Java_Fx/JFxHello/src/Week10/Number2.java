package Week10;

public class Number2 {
	public static void main(String[] args) {
		Student s = new Student("프로그래밍 스튜디오", "김한림", 3, "A+");
		System.out.println("과목 : " + s.SubjectName);
		System.out.println("이름 : " + s.name);
		System.out.println("학년 : " + s.year);
		System.out.println("성적 : " + s.grade);
	}
}
