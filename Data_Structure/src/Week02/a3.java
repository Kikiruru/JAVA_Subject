package Week02;

public class a3 {
	public static void main(String[] args) {
		int[] ai = {1, 2, 3};
		int[] bi = ai; // ai과 주소 공유
		
		int x = 10;
		int y = x;
		
		System.out.println(bi[1]++); //2출력 bi[2], ai[2]에 3저장
		System.out.println(y++); // 10출력 y에 11저장
		
		for(int i = 0 ; i <= 2; i++) {
			System.out.print(ai[i] +" "); // 1, 3, 3 출력
		}
		System.out.println();
		for(int i = 0 ; i <= 2; i++) {
			System.out.print(bi[i] +" "); // 1, 3, 3 출력
		}
		System.out.println();
		
		System.out.println(x); // 10출력
		System.out.println(y); // 11출력
	}
}
