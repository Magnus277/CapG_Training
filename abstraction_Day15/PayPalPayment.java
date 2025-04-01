package abstraction_Day15;

public class PayPalPayment extends Payment {
	public double discount;
	 public double payableAmount;
	 public double transactionFee;
	public PayPalPayment(double amount, String transactionId) {
		super(amount, transactionId);
	}
	double amount = this.getAmount();

	@Override
	void processPayment() {
		if (this.amount > 500.0f) {
			discount = (this.amount * 10) / 100;
			transactionFee=((this.amount-discount)*3)/100;
			System.out.println("Processing PayPal Payment...");
			payableAmount = (this.amount - discount) + transactionFee;
			System.out.println("Transaction ID: " + this.getTransactionId());
			System.out.println("Original Amount: " + this.getAmount());
			System.out.println("Discount Applied: " + this.discount);
			System.out.println("Transaction Fee: " + this.transactionFee);
			System.out.println("Final Payable Amount: " + this.payableAmount);
			System.out.println("PayPal Payment Successful!");
		} 
		else {
			discount=0.0f;
			transactionFee=(this.amount*3)/100;
			payableAmount = (this.amount - discount) + transactionFee;
			System.out.println("Processing PayPal Payment...");
			System.out.println("Transaction ID: " + this.getTransactionId());
			System.out.println("Original Amount: " + this.getAmount());
			System.out.println("Discount Applied: " + this.discount);
			System.out.println("Transaction Fee: " + this.transactionFee);
			System.out.println("Final Payable Amount: " + this.payableAmount);
			System.out.println("PayPal Payment Successful!");
		}
	}
}
