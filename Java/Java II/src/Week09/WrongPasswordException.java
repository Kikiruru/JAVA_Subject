package Week09;

public class WrongPasswordException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3356067770559216795L;

	public WrongPasswordException(String message) {
		super(message);
	}
}
