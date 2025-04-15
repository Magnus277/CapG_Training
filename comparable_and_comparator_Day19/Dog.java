package comparable_and_comparator_Day19;

import java.util.Arrays;

public class Dog implements Comparable {
	String name;
	int age;
	String breed;
	public Dog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public String toString() {
		return "name: " + name + " age: " + age + " breed:" + breed;
	}

	public static void main(String[] args) {
		Dog[] arr = new Dog[3];

		Dog d1 = new Dog("Pluto", 4, "Husky");
		Dog d3 = new Dog("Pluto", 4, "Argentino");
		Dog d2 = new Dog("Pluto", 4, "Kangal");

		arr[0] = d1;
		arr[1] = d2;
		arr[2] = d3;
		
		CompareBasedOnBreed compareBreed = new CompareBasedOnBreed();

		Arrays.sort(arr,compareBreed);

		for (Dog d : arr) {
			System.out.println(d);
		}
	}

	@Override
	public int compareTo(Object o) {
		Dog d = (Dog) o;
		if (this.name.compareTo(d.name) != 0) {
			return this.name.compareTo(d.name);
		} else if (this.age - d.age != 0) {
			return this.age - d.age;
		}
		
		return 0;
	}

//	public static void compareBasedOnBreed(Dog d1, Dog d2) {
//		CompareBasedOnBreed compareBreed = new CompareBasedOnBreed();
//
//		compareBreed.compare(d1, d2);
//	}
}
