package Week10;

public class Act1 {
	public static void main(String[] args) {
		System.out.println("(1)");
		String verb = "현실이 된다";
		System.out.println("생각이 " + verb);

		System.out.println("(2)");
		String s = "1234567";
		System.out.println("문자열의 길이는 " + s.length());

		System.out.println("(3)");
		s = "ABCDEFG";	
		s = s.toLowerCase(); 	
		System.out.println(s); //전부 소문자로 출력하도록 하려면 어떻게 해야 할까요?

		System.out.println("(4)");
		System.out.println("2 + 3 = " + (2 + 3));

		System.out.println("(5)");
		System.out.println("2 + 3 = " + 2 + 3);

	}
}
