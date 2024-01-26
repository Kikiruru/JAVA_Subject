package Week14;

public class StudentTest {
	public static void main(String[] args) {
		Student std1 = new Student("134", "java", "program"); //생성자 호출 (생성자 정의 안되있음 -> 디폴트 생성자 : 컴파일러가 자동적으로 생성자 생성)
		
		std1.display();
		System.out.println(std1.getNum());
		std1.setNum("45453");
		System.out.println(std1.getNum());

	}
}
