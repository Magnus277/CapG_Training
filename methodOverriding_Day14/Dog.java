package methodOverriding_Day14;

public class Dog extends Animal{
	
	String breed; //variable which belongs to dog class only
	
	public Dog(String breed) {
		this.breed=breed;
	}
	
	 void sound() {
		System.out.println("Dog is barking");
	}
	 
	 static void greet() {
		 System.out.println("Dog is greeted");
	 }
}
