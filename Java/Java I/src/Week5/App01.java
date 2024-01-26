package Week5;
/*for 반복문
 * 1. 주사위 다섯 번 던져서 나오는 주사위 눈을 출력하는 프로그램
 * 2. 1~100 범위에 있는 정수 중에서 7로 나눌 수 있는 숫자들을 출력하는 프로그
 * */
public class App01 {
	public static void main(String[] args) {
		//1~6
		int random;
		
		for(int i = 1; i < 6 ; i++) { //i <= 5 : 정수에서는 상관X
			random = (int)(Math.random()*6)+1;
			System.out.println(i +" : "+ random);
		}
		//ㄴ>1번 
		for(int i = 1 ; i<101 ; i++) {
			if(i % 7 == 0) {
				System.out.print(i +"  ");
				if(i % 5 == 0)
					System.out.print("\n");
			}
		}
		//ㄴ>2번 
		System.out.println("프로그램 종료");
	}
}
