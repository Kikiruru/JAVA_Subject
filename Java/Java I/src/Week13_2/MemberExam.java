package Week13_2;
import java.util.Scanner;
class Member{
	private String id; //아이디
	private int month; //생일
	
	public Member(String id, int month) {
		this.id = id;
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public String toString() {
		return "Member [id="+ id +",  month="+ month +"]";
	}
}

public class MemberExam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Member[] m = new Member[5];
		int month;
		String id;
		
		for(int i = 0; i < m.length; i++) {
			System.out.print("> id와 month 입력 : ");
			m[i] = new Member(in.next(), in.nextInt());
		}
		
		System.out.print("> month 입력 : ");
		month = in.nextInt();
		
		System.out.println(">> 생일 "+ month +" 월 회원 리스트 <<");
		for(int i = 0; i < m.length; i++) {
			if(month == m[i].getMonth())
				System.out.println(m[i]);
		}
		
		System.out.println(">변경 전 id 입력 :");
		id = in.next();
		boolean exis = true;
		for(int i = 0; i < m.length; i++) {
			if(id.equals(m[i].getId())) {
				System.out.println(m[i]);
				System.out.println(">변경 후 id 입력 :");
				id = in.next();
				m[i].setId(id);
				System.out.println(m[i]);
				exis = false;
				break;
			}
		}
		if(exis == true)
			System.out.println("해당 아이디 없음");
		System.out.println("프로그램 종료");
		in.close();
	}
}
