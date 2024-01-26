package Week14;
//11주차 개념활용 문제풀이
public class Student {
	private String num, name, address;
	//생성자 추가 - 객체 초기화
	public Student() {//생성자가 정의되어 있으면 디폴트 생성자는 만들어지지 않는다
	} //따라서 직접 만들어줘야 한다
	public Student(String name) { //생성자 오버로딩
		this("", name, "");
		/*
		this.name = name;
		num = "";
		address = "";
		*/
	}
	
	public Student(String num, String name, String address) {
		this.num = num;
		this.name = name;
		this.address = address;
	}
	//getter, setter 메소드 추가
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	
	void display() { //객체 내용 출력
		System.out.println("num:"+ num +"name:"+ name +"address:"+ address);
	}
}
