package abstraction_Day15;

public class CreditCardPayment extends Payment {
	public double discount;
	 public double payableAmount;
	 public double transactionFee;
	public CreditCardPayment(double amount, String transactionId) {
		super(amount, transactionId);
	}
	double amount = this.getAmount();

	@Override
	void processPayment() {
		System.out.println("Processing Credit Card Payment...");
		if (this.amount > 500.0f) {
			discount = (this.amount * 10) / 100;
			transactionFee=((this.amount-discount)*2)/100;
			payableAmount = (this.amount - discount) + transactionFee;
			System.out.println("Transaction ID: " + this.getTransactionId());
			System.out.println("Original Amount: " + this.getAmount());
			System.out.println("Discount Applied: " + this.discount);
			System.out.println("Transaction Fee: " + this.transactionFee);
			System.out.println("Final Payable Amount: " + this.payableAmount);
			System.out.println("Credit Card Payment Successful!");
		}
		else {
			discount=0.0;
			transactionFee=(this.amount*2)/100;
			payableAmount = (this.amount - discount) + transactionFee;
			System.out.println("Processing Credit Card Payment...");
			System.out.println("Transaction ID: " + this.getTransactionId());
			System.out.println("Original Amount: " + this.getAmount());
			System.out.println("Discount Applied: " + this.discount);
			System.out.println("Transaction Fee: " + this.transactionFee);
			System.out.println("Final Payable Amount: " + this.payableAmount);
			System.out.println("PayPal Credit Card Successful!");
		}
	}
}
