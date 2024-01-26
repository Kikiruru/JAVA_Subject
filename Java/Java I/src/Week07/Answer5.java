package Week07;

public class Answer5 {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		System.out.println("=== 배열 원소 출력 ========");
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*200)+1; //1~200 난수로 배열 초기화 
			System.out.print(array[i] +"  ");
		}
		
		System.out.println("\n=== 역순으로 출력 ========");
		for(int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] +"  ");
		}
	}
}
