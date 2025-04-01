package inheritance_Day12;

public class Driver {
	public static void main(String[] args) {
		Bike b=new Bike("Kawasaki","V4");
		Car c=new Car("ferrari",1000,"V8");
		
		b.display();
		c.display();
		System.out.println(c.price);
	}
}
