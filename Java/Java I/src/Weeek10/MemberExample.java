package Weeek10;
/*
 * 회원관리를 위한 클래스 Member를 작성하시오.
 * Member 클래스는 회원의 아이디와 이름을 가지며
 * 회원정보를 출력하는 display()	메소드,
 * 아이디를 변경하는 changeId()	메소드로 이루어진다.
 * Member 클래스를 작성하고 객체를 생성하여 테스트 하라
 */
class Member { //클래스가 여러개 있을 때 public은 한개만 사용 가능하다.
	String id, name;
	
	void disPlay() {
		System.out.println("id = "+ id +", name = "+ name);
	}
	
	void changeId(String id) {
		this.id = id;
	}
}

//주로 메인 함수가 있는 클래스에 public 사용  
public class MemberExample{ //메인함수를 포함하고 있는 클래스명으로 클래스 파일 생성 
	public static void main(String[] args) {
		Member mem; //클래스 변수(객체) 선언 
		mem = new Member(); //객체 생성
		mem.id = "hallym";
		mem.name = "software";
		mem.disPlay();
		mem.changeId("data");
		mem.disPlay();
	}
}

