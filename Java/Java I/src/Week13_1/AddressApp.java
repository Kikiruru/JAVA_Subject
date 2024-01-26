package Week13_1;

public class AddressApp {
	public static void main(String[] args) {
		Address[] frns = new Address[10];
		int cnt = 0;
		
		frns[cnt++] = new UnivAdd("LEE", "Computer", "010-333-5555");
		frns[cnt++] = new UnivAdd("SEO", "Electronics", "010-222-4444");
		frns[cnt++] = new CompAdd("YOON", "R&D 1", "02-123-9999");
		frns[cnt++] = new CompAdd("PARK", "R&D 2", "02-321-7777");
		
		//모든 동창 및 동료의 정 전체 출력
		for(int i = 0; i < cnt; i++) { //다형성
			frns[i].showInfo();
		}
	}
}
