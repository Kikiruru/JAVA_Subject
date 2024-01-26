package Week04;

public class Quiz3 {
	public static void main(String[] args) {
		boolean play = true;
		
		for (int i = 0; i < 4; i++) {
			if (i % 3 == 0)
				play = !play;
			play = !play;
			System.out.println(play);
		}
	}
}
