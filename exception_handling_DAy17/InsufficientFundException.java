package exception_handling_DAy17;

public class InsufficientFundException extends RuntimeException {
	public InsufficientFundException(String message) {
		super(message);
	}
}
