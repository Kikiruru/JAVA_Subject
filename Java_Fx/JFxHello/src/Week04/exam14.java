package Week04;

public class exam14 {
	public static void main(String[] args) {
		try {
			int result = safeAdd(1073741823, 1073741824);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("1");
		}
	}
	
	public static int safeAdd(int left, int right) {
		if((right > 0)) {
			if (left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("2");
			}
		} else {
			if (left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("3");
			}
		}
		
		return left + right;
	}
}
