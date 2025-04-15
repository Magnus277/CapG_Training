package exception_handling_DAy17;

public class InvalidPinException2 extends RuntimeException {
		private String message;
		
		
		public InvalidPinException2(String message) {
			this.message=message;
		}
		
		@Override
		public String getMessage() {
			return message;
		}
	
	
}
