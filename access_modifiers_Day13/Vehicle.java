package access_modifiers_Day13;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	public Vehicle(String vehicleNumber,String brand,String model,double rentalPricePerDay,boolean isAvailable) {
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		this.model=model;
		this.rentalPricePerDay=rentalPricePerDay;
		this.isAvailable=isAvailable;
	}
	
	public void displayDetails() {
		System.out.print(this.vehicleNumber+" "+this.brand+" "+this.model+" "+this.rentalPricePerDay+" "+this.isAvailable);
		
	}
	
	public void rentvehicle() {
		if(!isAvailable==true) {
			System.out.println("Rent not available");
		}
		else {
			System.out.println("Rent available");
		}
	}
}

