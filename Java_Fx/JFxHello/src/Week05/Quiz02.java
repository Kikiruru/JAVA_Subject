package Week05;

public class Quiz02 {
	public static void main(String[] args) {
		char grade;
		int score = 83;
		
		if(score >= 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		
		System.out.println("grade : "+ grade +"\t score : "+ score);
	}
}
