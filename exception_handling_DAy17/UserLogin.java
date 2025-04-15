package exception_handling_DAy17;

public class UserLogin {
	private int pin=1234;
	
	public void login(int pin) throws InvalidPinException {
		if(this.pin==pin) {
			System.out.println("User successsfully logged in!");
		}
		else {
			throw new InvalidPinException("THe user pin is invalid!");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		UserLogin user=new UserLogin();
//		user.login(1224);
		try {
		user.login(1224);
		}
		catch(InvalidPinException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main end");
	}
}
