package Week09;

class NotFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -24765489227522062L;

	NotFoundException(String message){
		super(message);
	}
}

public class searchArrayTest {
	public static int searchArray(int[] array, int num) throws NotFoundException {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num)
				return i;
		}
		throw new NotFoundException("배열에서 찾을 수 없습니다.");
	}
	
	public static void main(String[] args) {
		int[] numArray  = {1, 2, 3, 4, 5};
		
		try {
			System.out.println("seachArray : 3");
			System.out.println("index : "+ searchArray(numArray, 3));
			System.out.println("seachArray : 5");
			System.out.println("index : "+ searchArray(numArray, 5));
			System.out.println("seachArray : 7");
			System.out.println("index : "+ searchArray(numArray, 7));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
