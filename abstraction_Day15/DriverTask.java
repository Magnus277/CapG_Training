package abstraction_Day15;

public class DriverTask {
	public static void main(String[] args) {
		Payment p=new CreditCardPayment(600.0,"TXN12345");
		p.processPayment();
		System.out.println("----------------------");
		Payment p1=new PayPalPayment(300.0,"TXN67890");
		p1.processPayment();
		
	}
}
