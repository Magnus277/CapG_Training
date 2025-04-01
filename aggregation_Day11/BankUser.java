package aggregation_Day11;

public class BankUser {
	public static void main(String[] args) {
		Customer cust=new Customer("Debayan");
		Bank b=new Bank("SBI",cust);
		b.display();
		b=null;
		System.out.println(cust.customerName);
//		b.display(); //cant be executed as b=null
	}
}
