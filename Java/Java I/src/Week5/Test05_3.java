package Week5;

public class Test05_3 {
	public static void main(String[] args) {
		int t = 1;
		
		System.out.print("1~100에서 7로 나눌 수 있는 수 : ");
		while(t <= 100) {
			if(t%7 == 0)
				System.out.print(t +"  ");
			t++;
		}
	}
}
