package Week06;

public class Answer1 {
	public static void main(String[] args) {
		int cnt = 0;
		for(char ch = 'a'; ch <= 'z'; ch++) {
			cnt++;
			System.out.print(ch);
			if(cnt%5 == 0)
				System.out.print('\n');
		}
	}
}
