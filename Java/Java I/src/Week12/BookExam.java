package Week12;
import java.util.Scanner;
class Book2{
	private String title, author;
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "제목 : "+ title +",\t지은이 : "+ author;
	}
}

public class BookExam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Book2 b, b2;
		String title, author;
		
		System.out.println("제목과 지은이를 입력하세요 : ");
		title = in.next();
		author = in.next();
		b = new Book2(title, author);
		System.out.println("제목과 지은이를 입력하세요 : ");
		title = in.next();
		author = in.next();
		b2 = new Book2(title, author);
		
		System.out.println(b);
		System.out.println(b2);
		in.close();
	}
}
