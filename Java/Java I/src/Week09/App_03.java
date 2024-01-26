package Week09;
/* big() 메소드
 * 	두 개의 정수를 매개변수로 받아 큰 값을 반환
 * 	값을 매개변수로 전달 */
public class App_03 {
	public static void main(String[] args) {
		int d1 = (int)(Math.random()*15)+1;
		int d2 = (int)(Math.random()*15)+1;
		int max = big(d1, d2);
		
		write("생성된 난수 : ", d1);
		write("생성된 난수 : ", d2);
		write("max : ", max);
	}
	
	public static int big(int a, int b) {
		return(a > b) ? a : b;
	}
	
	public static void write(String message, int value) {
		System.out.println(message + value);
	}
}
