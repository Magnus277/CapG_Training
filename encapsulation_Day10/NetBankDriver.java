package encapsulation_Day10;

public class NetBankDriver {
	public static void main(String[] args) {
		NetBank b=new NetBank();
		b.getBalance(1234);
		b.setBalance(5000,1234);
		b.getBalance(1234);
		b.withdraw(20000, 1234);
		b.getBalance(1234);
	}
}
