package one_to_many_Day11;
//one
public class Bank {
	Customer[] customers;
	String bankName;
	static int count=0;
	
	public Bank(int size,String bankName) {
		customers=new Customer[size];
		this.bankName=bankName;
	}
	
	public void addCustomers(Customer customer) {
		if(count<customers.length) {
			customers[count++]=customer;
			System.out.println("Customer added");
		}
		else {
		System.out.println("Cannot add customer,array is filled!");
	}
	}
	
	public void displayCustomers() {
		for(int i=0;i<customers.length;i++) {
			Customer c=customers[i];
			System.out.println(c.customerName+" "+c.id);
		}
	}
}





// Customer[] customers;
//String bankName;
//static int count=0;
//
//public Bank(int size,String bankName){
//	customers=new Customer[size];
//	this.bankName=bankName;
//}
//
//public void addCustomer(Customer customer) {
//	if(count<customers.length) {
//		customers[count++]=customer;
//		System.out.println("Customer added");
//	}
//	else {
//		System.out.println("Cannot add customer,array is filled!");
//	}
//}
//
//
//public void displayCustomers() {
//	for(int i=0;i<count;i++) {
//		Customer c=customers[i];
//		System.out.println(c.customerName+"   "+c.id);
//	}
//}