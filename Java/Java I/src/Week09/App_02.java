package Week09;
// 배열 합을 계산하는 메소드
/* sum_array() 메소드
 *	매개변수로 배열을 받음 
 *	배열 원소 합을 계산하여 반환 
 * */
public class App_02 {
	public static void main(String[] args) {
		int[] digit = new int[] {3,12,6,21,7,38,20};
		int[] dim = {4,7,9,11,6,9,31,28,31,60,41,71};
		
		System.out.println("배열 digit 합 = "+ sum_array(digit));
		System.out.println("배열 dim  = "+ sum_array(dim));
	}
	
	public static int sum_array(int[] array) {
		int hap = 0;
		for(int data : array)
			hap += data;
		return hap;
	}
}
