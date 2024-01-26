package Week05;

public class Quiz03 {
	public static void main(String[] args) {
		int score = 89;
		
		if(score >= 95) {
			System.out.println("점수가 95 이상 입니다.");
			System.out.println("등급은 A+ 입니다.");
		} else if(score >= 90) {
			System.out.println("점수가 90점 이상 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if(score >= 80) {
			System.out.println("점수가 80점 이상 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if(score >= 70) {
			System.out.println("점수가 70점 이상 입니다.");
			System.out.println("등급은 C 입니다.");
		} else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}
}
