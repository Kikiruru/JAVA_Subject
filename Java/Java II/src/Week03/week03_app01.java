package Week03;

public class week03_app01 {
	public static void main(String[] args) {
		Student[] std = new Student[2];
		
		System.out.println(">> 객체 생성 후 <<");
		std[0] = new Student();
		std[1] = new Student("daniel", 80.3);
		for(Student s : std) {
			System.out.println(s.toString());
		}
		
		System.out.println("\n>> anonymous이름과 성적 설정 후 <<");
		std[0].setName("benny");
		std[0].setScore(100.0);
		System.out.println(std[0].toString());
		
		System.out.println("\n>> daniel 성적 변경 후 <<");
		std[1].setScore(60.7);
		System.out.println(std[1].toString());
	}
}
