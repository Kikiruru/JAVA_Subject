package Week07;

public class Week5_Reference_Type {
	public static void main(String[] args) {
		String[] oldStirngArray = {"Apple juice", "Banana pancake", "Carrot cake",
				"Dark chocolate", "Egg benedict", "French fries", "Garlic toast", "Honey Bread"};
		String[] newStringArray	= new String[13];
		
		System.arraycopy(oldStirngArray, 2, newStringArray, 4,oldStirngArray.length-2);
		for(int i = 0; i < newStringArray.length; i++) {
			System.out.print(newStringArray[i] +">>");
		}
	}
}
