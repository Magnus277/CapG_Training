package abstraction_Day15;

public abstract class Payment {
	private double amount;
	private String transactionId;
	abstract void processPayment();
	
	public Payment(double amount,String transactionId) {
		this.amount=amount;
		this.transactionId=transactionId;
	}
	
	public double getAmount() {
		return amount;
	}
	public String getTransactionId() {
		return transactionId;
	}
}
