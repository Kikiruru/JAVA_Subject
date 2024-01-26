package Week10;

public class SelectNumber extends OnOff{ //[3]
	String name;
	int place;
	
	SelectNumber(String name, int place){
		this.name = name;
		this.place = place;
	}
	
	void select1(int num) {
		System.out.println(num + ".과목 정보 선택");
	}
	void select2(int num) {
		System.out.println(num + ".과목 공지 선택");
	}
	void notice(String notice) {
		System.out.println("공지: " + notice);
	}
}
