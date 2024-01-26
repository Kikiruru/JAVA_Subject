package Week09;

public class MusicExample {
	public static void main(String[] args) {
		Music song1 = new Music(); // B
		System.out.println("song1.singer:"+ song1.singer);
		System.out.println();
		
		Music song2 = new Music("LILAC"); // B
		System.out.println("song2.singer:"+ song2.singer);
		System.out.println("song2.singName:"+ song2.singName);
		System.out.println();
		
		Music song3 = new Music("좋은날", "파랑"); // B
		System.out.println("song3.singer:"+ song3.singer);
		System.out.println("song3.singName:"+ song3.singName);
		System.out.println();
		
		Music song4 = new Music("에잇", "보라", 2020); // B C
		System.out.println("song4.singer:"+ song4.singer);
		System.out.println("song4.singName:"+ song4.singName);
		System.out.println("song4.color:"+ song4.color);
		System.out.println("song4.year:"+ song4.year);
		System.out.println();
		
	}
}
