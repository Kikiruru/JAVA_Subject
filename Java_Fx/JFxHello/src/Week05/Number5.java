package Week05;

	public class Number5 {
		public static void main(String[] args) {
			int score = (int) (Math.random() * 20) + 81;
			score = 92;
			System.out.println("점수: "+ score);
			
			String grade;
			
			if (score >= 85) {
				if(score > 90) //###
					grade = "A+";
				else
					grade = "A";
			} else {
				if (score >= 75)
					grade = "B+";
				else
					grade = "B";
			}
			
			System.out.println("학점: "+ grade);
		}
	}
