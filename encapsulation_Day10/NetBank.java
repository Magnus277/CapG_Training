package encapsulation_Day10;

public class NetBank {
	private int currentBalance = 50000;
	private int pin = 1234;// can't be accessed outside the class

	public void setBalance(int deposit, int pin) {
		if (this.pin == pin) {
			currentBalance += deposit;
		} else {
			System.out.println("Invalid Pin");
		}
	}

	public void getBalance(int pin) {
		if (this.pin == pin) {
			System.out.println(currentBalance);
		} else {
			System.out.println("Invalid Pin");
		}
	}

	public void withdraw(int withdraw, int pin) {
		if (this.pin == pin) {
			if (currentBalance >= withdraw) {
				currentBalance -= withdraw;
				System.out.println(withdraw);
			} else {
				System.out.println("Insufficient Funds!");
			}
		} else {
			System.out.println("Invalid Pin!");
		}
	}
}
