package Week07;

import java.util.Scanner;

class NestStudent{
	private String name;
	private Subject sb;
	
	public NestStudent(String name, int cnt) {
		this.name = name;
		System.out.println(name +"==>");
		sb = new Subject(cnt);
	}
	
	void stdPrint() {
		System.out.println("==========================");
		System.out.println(name +"학생의 수강과목");
		sb.subjectprint();
	}
	
	class Subject{
		String[] subject;
		Scanner sc = new Scanner(System.in);
		
		public Subject(int num) {
			subject = new String[num];
			for(int i = 0; i < subject.length; i++) {
				System.out.print("수강 과목("+ (i+1) +"):");
				subject[i] = sc.next();
			}
		}
		
		public void subjectprint() {
			for(String i : subject) {
				System.out.println(i);
			}
		}
	}
}

public class Answer6 {
	public static void main(String[] args) {
		NestStudent obj[] = {new NestStudent("홍길동", 2), new NestStudent("임꺽정", 3),
				new NestStudent("심청이", 1)};
		for(NestStudent ns : obj)
			ns.stdPrint();
	}
}
