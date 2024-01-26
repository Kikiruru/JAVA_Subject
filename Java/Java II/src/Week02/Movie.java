package Week02;

class Movie {
	private String title, director; //영화 제목, 감독
	private int score, year; // 평점, 출시연도
	
	public Movie() {}
	
	public Movie(String title, int score, String director, int year) {
		this.title = title; this.score = score;
		this.director = director; this.year = year;
	}

	public void print() {
		System.out.println("[영화제목 : "+ title +"]");
		System.out.println("[평점 : "+ score +"]");
		System.out.println("[감독 : "+ director +"]");
		System.out.println("[출시연도 : "+ year +"]");
	}
}
