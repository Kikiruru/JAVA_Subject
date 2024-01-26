package Weeek10;

public class Answer1 {
	public static void main(String[] args) {
		String[] card = {"Clubs", "Diamonds", "Hearts", "Spades"};
		array_print(card); //array_point() 메소드 호출 
	}
	
	public static void array_print(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +"  ");
		}
		System.out.println();
	}
}
