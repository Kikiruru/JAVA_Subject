package Week06;

public class Answer3 {
	public static void main(String[] args) {
		int hap = 0;
		
		for(int i = 15; i > 0; i -= 2) {
			hap += i;
			System.out.println("i:"+ i +", hap:"+ hap);
		}
	}
}
