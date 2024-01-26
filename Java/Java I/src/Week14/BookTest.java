package Week14;

class Book{
	private String title, author;// 제목, 저자
	private int page; // 페이지수
	
	Book(String title, int page, String author){
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	String getTitle() {
		return title;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	String getAuthor() {
		return author;
	}
	
	void setAuthor(String author) {
		this.author = author;
	}
	
	int getPage() {
		return page;
	}
	
	void setPage(int page) {
		this.page = page;
	}
	
	public String toString() {
		String a;
		a = "책 이름 : "+ title +"\n";
		a += "페이지 수 : "+ page +"\n";
		a += "저자 : 	"+ author +"\n";
		return a;
	}
}

class Magazine extends Book{
	 private String release; // 발매일
	 
	 Magazine(String title, int page, String author, String release){
		 super(title, page, author);
		 this.release = release;
	 }

	 String getRelease() {
		 return release;
	 }
	 
	 void setRelease(String release) {
		 this.release = release;
	 }
	 
	 public String toString() {
		 return super.toString() +"발매일 : "+ release +"\n";
	 }
}

public class BookTest {
	public static void main(String[] args) {
		Magazine bookA = new Magazine("hallymA", 40, "big", "2019년 2월 25일");
		Magazine bookB = new Magazine("softwareB", 80, "smart", "2017년 3월 8일");
        
		System.out.println(bookA);
		bookA.setAuthor("BIG");
		System.out.println("----bookA 객체 저자 변경 후----");
		System.out.println(bookA);
		System.out.println("\n"+ bookB +"\n");
		bookB.setPage(50);
		System.out.println("----bookB 객체 페이지 변경 후----");
		System.out.println(bookB +"\n");
		bookB.setRelease("2020년 8월 31일");
		System.out.println("----bookB 객체 발매일 변경 후----");
		System.out.println(bookB);
	}
}
