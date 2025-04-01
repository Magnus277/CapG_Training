package methodOverriding_Day14;

public class Driver {
	public static void main(String[] args) {
		Animal dogAnimal=new Dog("Siberian Husky");
		dogAnimal.sound();
		
		dogAnimal.greet(); //static members belong to class, so animal's method will get called
		
		
//		Tiger t=new Tiger();
//		t.sound();
		
		
		
		
//	Animal dog=new Dog();  //UpCasting
//	dog.sound();

		
		String dogBreed=((Dog)dogAnimal).breed;//downcasting
		System.out.println(dogBreed);
		
		
//		System.out.println(dogAnimal.breed()); //cant access members of child with parent reference
		
	}
}
