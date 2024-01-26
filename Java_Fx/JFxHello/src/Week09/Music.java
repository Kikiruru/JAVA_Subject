package Week09;

public class Music {
	String singer = "아이유";
	String singName;
	String color;
	int year;
	
	Music(){}
	Music(String singName){
		this.singName = singName; // (A)
	}
	Music(String singName, String color){
		this(singName);
		this.color = color;
	}
	Music(String singName, String color, int year){
		this.singName = singName;
		this.color = color;
		this.year = year;
	}
}
