package Week07;

public class Answer1 {
	public static void main(String[] args) {
		for(int i=1; i<11; i++) { //i : x값 
			for(int j=1; j<11; j++) {
				if(4*i+5*j == 60)
					System.out.printf("(%d, %d)\n",i, j);
			}
		}
		System.out.println("프로그램 종료");
	}
}
