package Week11;

class Member {
	/*
	private String id, name; //전용 멤버 
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {return id;} //getter method : 필드 값 반환 
	public void setId(String id) {this.id = id;} //setter method : 필드 값 변경, 검증 
	
	public String getName()	{return name;}
	public void setName(String name) {this.name = name;}
	
	void display() {
		System.out.println("id = "+ id +", name = "+ name);
	}
	*/
	private String id, name; //전용 멤버 
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public void changeId(String id) {this.id = id;}
	
	void display() {
		System.out.println("id = "+ id +", name = "+ name);
	}
}

public class MemberExample {
	public static void main(String[] args) {
		/*
		Member mem; //클래스 변수(객체) 선언 
		mem = new Member("hallym", "software"); //객체 생성 
		mem.display();
		mem.setId("data");
		System.out.println("id : "+ mem.getId());
		mem.display();
		*/
		Member mem;
		mem = new Member("hallym", "김대성");
		mem.display();
		mem.changeId("kimdaesung");
		mem.display();
	}
}
