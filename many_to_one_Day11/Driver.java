package many_to_one_Day11;

public class Driver {
	public static void main(String[] args) {
		
	
	 Bank bank1=new Bank("SBI");
	 
	 Customer c1=new Customer(1,"Debayan",bank1);
	 Customer c2=new Customer(2,"Gaurav",bank1);
	 Customer c3=new Customer(3,"Anirban",bank1);
	 
	 
	 c1.display();
	 c2.display();
	 c3.display();
}
}
