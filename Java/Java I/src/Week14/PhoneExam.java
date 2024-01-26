package Week14;

class Phonenum {
	private String name, phone; //이름, 연락처
	
	public Phonenum(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void showInfo() {
		System.out.print("이름: "+ name +"   ");
		System.out.print("전화: "+ phone +"   ");
	}
}

class UnivAdd extends Phonenum { // 학교
	private String major; // 전공
	public UnivAdd(String na, String ma, String ph) {
		super(na, ph);	
		major = ma;  
	}
	public void showInfo() {  
		super.showInfo();
		System.out.println("전공: " + major);
	}
}
class CompAdd extends Phonenum { // 직장
	private String department; // 부서
	public CompAdd(String na, String de, String ph) {
		super(na, ph);
		department = de;
}
	public void showInfo() { 
		super.showInfo();
		System.out.println("부서: " + department);
	}
}

public class PhoneExam {
	public static void main(String[] args) {
		Phonenum[] ph = new Phonenum[4];
		int cnt = 0;
		
		ph[cnt++] = new UnivAdd("LEE", "Computer", "010-333-555");
		ph[cnt++] = new UnivAdd("SEO", "Electronics", "010-222-444");
		ph[cnt++] = new CompAdd("YOON", "R&D 1", "02-123-999");
		ph[cnt++] = new CompAdd("PARK", "R&D 2", "02-321-777");
		
		for(int i = 0; i < cnt; i++) {
			ph[i].showInfo();
		}
	}
}
