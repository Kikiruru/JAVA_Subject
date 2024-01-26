package Week02;

public class week02_app04 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone("010-1234-5678");
		
		System.out.println("\"객체생성\"");
		System.out.println(cp.toString());
		System.out.println("\"전원 off\"");
		cp.powerToggle();
		System.out.println(cp.toString());
		System.out.println("\"전원 on\"");
		cp.powerToggle();
		System.out.println(cp.toString());
	}
}
