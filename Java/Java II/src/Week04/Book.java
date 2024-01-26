package Week04;

class Book {
	protected String title, writer;
	protected int pages;
	
	Book() {}
	Book(String title, int pages, String writer){
		this.title = title; this.pages = pages; this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}
	public int getPages() {
		return pages;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String toString() {
		return "책이름 : "+ title +"\n페이지 수 : "+ pages
				+"\n저자 : "+ writer;
	}
}

class Magazine extends Book{
	private String date;
	
	Magazine() {}
	Magazine(String title, int pages, String writer, String date) {
		super(title, pages, writer);
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String toString() {
		return super.toString()+"\n발매일 : "+ date;
	}
}