package Week04;

public class problem20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score1 = 80;
		int score2 = 72;
		int score3 = 95;
		
		int sum = score1 + score2 + score3;
		System.out.println("sum : "+ sum);
		
		double avg = sum / 3;
		System.out.println("avg : "+ avg);
		
		char grade = (avg > 90)? 'A' : ((avg > 80)? 'B' : 'C');
		System.out.println("grade : "+ grade);
	}
}
