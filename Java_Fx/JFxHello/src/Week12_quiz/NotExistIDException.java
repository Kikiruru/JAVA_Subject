package Week12_quiz;

@SuppressWarnings("serial")
public class NotExistIDException extends Exception {
	public NotExistIDException() {
	}

	public NotExistIDException(String message) {
		super(message);
	}
}
