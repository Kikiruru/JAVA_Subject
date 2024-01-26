package Week09;

class Member{
	private String id;
	private String password;
	
	public Member() {
		id="kim";
		password="0000";
	}
	
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
}

class MemberService{
	Member member = new Member();
	boolean login(String id, String password) {
		if(id.equals(member.getId()) && password.equals(member.getPassword())) // (a), (b)
			return true;
		else
			return false;
	}
	
	void logout(String id) {
		if(id.equals(member.getId())) // (c)
			System.out.println("로그아웃 되었습니다.");
	}
}

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("kim", "0000"); // (d)
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("kim"); // (e)
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
