package Week10;

public class SmartPhone extends Phone { // 빈칸2
	// 생성자
	public SmartPhone(String owner) {
		super(owner); // 부모 클래스인 추상클래스 Phone 객체를 생성, 빈칸3
	} // 부모 클래스의 turnOn() turnOff() 메소드 사용가능

	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
