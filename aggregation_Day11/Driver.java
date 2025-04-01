package aggregation_Day11;

public class Driver {
	public static void main(String[] args) {
		Sim sim=new Sim(123456789);
		Phone phone=new Phone("Apple",sim);
		phone.display();
		phone=null;
		System.out.println(sim.phoneNo);
	}
}
