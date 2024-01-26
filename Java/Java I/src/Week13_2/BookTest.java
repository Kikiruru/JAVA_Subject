package Week13_2;
import java.util.Scanner;
class Book3{
	private String title, author, position; //제목 지은이 위치
	public Book3(String title, String author, String position) {
		this.title = title;
		this.author = author;
		this.position = position;
	}
	
	public String getTitle() {
		return title;
	}
	
	void bookWrite() { //객체 출력 메소드, 디폴트 멤버
		String prompt = "제목 : "+ title;
		prompt += "\t저자 : "+ author;
		prompt += "\t위치 : "+ position;
		System.out.println(prompt);		
	}
}

public class BookTest {
	public static void search(Book3[] book, String title) {
		boolean flag = true;
		for(Book3 b : book) {
			if(title.equals(b.getTitle())) { //b.getTitle().equals(title)
				b.bookWrite();
				flag = false;
				break;
			}
		}
		
		if(flag)
			System.out.println(title +" : 해당 도서가 존재하지 않습니다");
	}
	public static void main(String[] args) {
		Book3[] book = new Book3[2]; // Book 배열 선언 & 생성
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < book.length; i++) {
			System.out.print("제목 >> ");
			String title = scanner.nextLine();
			System.out.print("지은이 >> ");
			String author = scanner.nextLine();
			System.out.print("위치 >> ");
			String position = scanner.nextLine();
			book[i] = new Book3(title, author, position); //배열 원소 객체 생성 
		}
		
		for(Book3 b : book) {
			b.bookWrite();
		}
		
		search(book, "총균쇠");
		search(book, "칼의 노래");
		
		scanner.close();
	}
}
