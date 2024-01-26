package Week12;
import java.util.Scanner;
class Service{
	private String id;
	public boolean login(String id, String pass) {
		this.id = id;
		if(id.equals("hallym") && pass.equals("3456"))
			return true;
		else
			return false;
	}
	
	public void logout() {
		System.out.println(id +" 님 로그아웃 되었습니다");
	}
}

public class ServiceTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Service s = new Service();
		String id, pass;
		int cnt = 0;
		do {
			System.out.println("id 와 패스워드를 입력하세요 >>");
			id = in.next();
			pass = in.next();
			if(s.login(id, pass)) {
				System.out.println("로그인 되었습니다");
				s.logout();
			}
			else {
				System.out.println("로그인 실패");
				System.out.println("아이디와 패스워드를 확인하세요");
			}
			cnt++;
		}while(cnt < 2);
		in.close();
	}
}
