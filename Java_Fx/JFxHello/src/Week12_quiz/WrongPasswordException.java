package Week12_quiz;

@SuppressWarnings("serial")
public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
	}

	public WrongPasswordException(String message) {
		super(message);
	}
}
