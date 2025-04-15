package exception_handling_DAy17;

public class Atm {
	private int pin=1234;
	private int balance=5000;
	public void deposit(int pin,int amount) throws InvalidPinException2{
		if(this.pin==pin) {
			balance+=amount;
		}
		else {
			throw new InvalidPinException2("Invalid pin");
		}
	}
	
	public String withdraw(int pin,int amount) throws InsufficientFundException{
		if(this.pin==pin) {
			if(balance>=amount) {
				balance-=amount;
				return "Amount withdrawn.Current balance: "+this.balance;
			}
			else {
				throw new InsufficientFundException("Insufficient funds");
			}
		}
		else {
			throw new InvalidPinException2("Invalid pin");
		}
	}
	public static void main(String[] args) {
		Atm atm=new Atm();
		atm.withdraw(1234,000);
	}
}
