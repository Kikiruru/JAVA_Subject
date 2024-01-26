package Week09_2;

class ArrayIndexOutOfBoundsException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -737246703066397588L;

	public ArrayIndexOutOfBoundsException() {
		super("배열의 인덱스를 확인해서 사용하세요");
	}
}

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		int[] array = new int[2];
		array[0] = 10;
		array[1] = 20;
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
