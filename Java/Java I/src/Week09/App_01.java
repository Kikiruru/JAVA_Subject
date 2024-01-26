package Week09;
//배열을 초기화하는 매소드 작성
/*int_array() 메소드
 * 	매개변수로 받은 배열 초기화
 *  참조를 매개변수로 전달 
 *  반환값 없음 */
public class App_01 {
	public static void main(String[] args) {
		int[] arr1 = new int[7];
		System.out.println("배열을 초기화 합니다");
		init_array(arr1);
		System.out.println("배열 원소를 출력 합니다");
		write(arr1, "배열 : arr1");
	}
	
	public static void init_array(int[] dim) {
		for(int i = 0; i < dim.length; i++) {
			dim[i] = (int)(Math.random()*50) + 1;
		}
	}
	
	public static void write(int[] dim, String message) {
		System.out.println("===="+ message +"====");
		for(int value : dim) {
			System.out.print(value +"  ");
		}
		System.out.println();
	}
}
