package Week04;

public class week04_app02 {
	public static void main(String[] args) {
		Magazine bookA = new Magazine("잡지A", 10, "기자A", "2010년 2월 25일");
		Magazine bookB = new Magazine("잡지B", 20, "기자B", "2010년 3월 8일");
		
		System.out.println(bookA);
		
		System.out.println("\n---bookA 객체 저자 변경 후---");
		bookA.setWriter("기자변경");
		System.out.println(bookA);
		
		System.out.println("\n"+ bookB);
		
		System.out.println("\n---bookB 객체 페이지 변경 후---");
		bookB.setPages(50);
		System.out.println(bookB);
		
		System.out.println("\n---bookB 객체 발매일 변경 후---");
		bookB.setDate("2010년 8월 31일");
		System.out.println(bookB);
	}
}
