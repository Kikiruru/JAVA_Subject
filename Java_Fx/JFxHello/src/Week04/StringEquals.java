package Week04;

public class StringEquals {
	public static void main(String[] args) {
		String strVar1 = "가나다";
		String strVar2 = "가나다";
		String strVar3 = new String("가나다");
		
		System.out.println(strVar1 == strVar3);
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}
