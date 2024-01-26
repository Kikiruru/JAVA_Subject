package Week07;
//크기순으로 정렬하기 
public class Week07_array {
	public static void main(String[] args) {
		int[] digit = new int[6]; //배열 선언 
		int temp;
		for(int i = 0; i < digit.length; i++) {
			digit[i] = (int)(Math.random()*100)+1;
			System.out.print(digit[i] + "\t");
		}
		System.out.println();
		
		for(int i = 0; i<digit.length-1; i++) {
			for(int j = i+1; j<digit.length; j++) {
				if(digit[i] > digit[j]) {
					temp = digit[i];
					digit[i] = digit[j];
					digit[j] = temp;
				}
			}
		}
		
		System.out.println("\n==== 정렬 후 데이터 ====");
		for(int value : digit) {
			System.out.print(value +"\t");
		}
	}
}
