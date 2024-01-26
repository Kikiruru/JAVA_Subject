package Week03;
import java.util.Scanner;
class Professor{
	private int id;
	private String name;
	private int age;
	
	Professor(int id, String name, int age){
		this.id = id;
		this.name = name;
		this. age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

class Student {
	private int id; //주민번호
	private String name; //이름
	private int score; //해당 교과목 점수
	private Professor advisor; //지도교수 Professor 클래스
	
	Student(int id, String name, int score){
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}


	public Professor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}
	
	public void ChangeScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
}

class ProfessorList {
	private Professor[]	 pfs;
	private int number = 0;
	
	ProfessorList(int number){
		pfs = new Professor[number];
	}
	
	ProfessorList() {
		pfs = new Professor[20];
	}
	
	public void addProfessor(Professor p) {
		pfs[number] = p;
		number++;
	}
	
	public Professor getById(int id) {
		for(int i = 0; i < number; i++) {
			if(id == pfs[i].getId())
				return pfs[i];
		}
		return null;
	}
	
	public Professor getByName(String name) {
		for(int i = 0; i < number; i++) {
			if(name.equals(pfs[i].getName()))
				return pfs[i];
		}
		return null;
	}
	
	public Professor professorAt(int num) {
		return pfs[num];
	}
}

class StudentList {
	private Student[] std;
	private int number = 0;
	
	StudentList(int number) {
		std = new Student[number];
	}
	
	StudentList() {
		std = new Student[20];
	}
	
	public void addStudent(Student s) {
		std[number] = s;
		number++;
	}
	
	public Student getById(int id) {
		for(int i = 0; i < number; i++) {
			if(id == std[i].getId())
				return std[i];
		}
		return null;
	}
	
	public Student getByName(String name) {
		for(int i = 0; i < number; i++) {
			if(name.equals(std[i].getName()))
				return std[i];
		}
		return null;
	}
	
	public void sortByScore() {
		Student temp;
		for(int i = 0; i < number-1; i++) {
			for(int j = i+1; j < number; j++) {
				if(std[i].getScore() < std[j].getScore()) {
					temp = std[i];
					std[i] = std[j];
					std[j] = temp;
				}
			}
		}
	}
	
	public void sortById() {
		Student temp;
		for(int i = 0; i < number-1; i++) {
			for(int j = i+1; j < number; j++) {
				if(std[i].getId() < std[j].getId()) {
					temp = std[i];
					std[i] = std[j];
					std[j] = temp;
				}
			}
		}
	}
	
	public void reverse() {
		Student[] temp = new Student[number];
		for(int i = 0; i < number; i++) {
			temp[i] = std[number-1-i];
		}
		std = temp;
	}
	
	public double average() {
		double avg = 0;
		int sum = 0;
		for(int i = 0; i < number; i++) {
			sum += std[i].getScore();
		}
		avg = sum/number;
		return avg;
	}
}

public class School {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Professor p;
		ProfessorList pl = new ProfessorList(5);
		Student s;
		StudentList sl = new StudentList(10);
		int id, age, score;
		String name;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("교수님의 Id, 이름, 나이를 입력하세요:");
			id = input.nextInt();
			name = input.next();
			age = input.nextInt();
			p = new Professor(id, name, age);
			pl.addProfessor(p);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print("학생의 Id, 이름, 점수를 입력하세요:");
			id = input.nextInt();
			name = input.next();
			score = input.nextInt();
			s = new Student(id, name, score);
			s.setAdvisor(pl.professorAt(i/2));
			sl.addStudent(s);
		}
		
		input.close();
	}
}
