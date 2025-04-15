package exception_handling_DAy17;

public class InvalidPinException extends Exception {
	private String message;
	
	
	public InvalidPinException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
