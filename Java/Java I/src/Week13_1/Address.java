package Week13_1;

public class Address {
	private String name; //이름
	private String phone; //연락처
	
	public Address(String na, String ph) {
		name = na;
		phone = ph;
	}
	
	public void showInfo() {
		System.out.println("이름: "+ name	);
		System.out.println("전화: "+ phone);
	}
}

class UnivAdd extends Address{ //학교 
	private String major; //전공
	
	public UnivAdd(String na, String ma, String ph) {
		super(na, ph); //부모클래스 생성자 호출 이름, 전화번호
		major = ma; //전공
	}
	
	public void showInfo() { //메소드 재정의
		super.showInfo(); //부모 클래스의 showInfo()
		System.out.println("전공: "+ major);
	}
}

class CompAdd extends Address{ //직장
	private String department; //부서
	public CompAdd(String na, String de, String ph) {
		super(na, ph);
		department = de;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("부서: "+ department);
	}
}
