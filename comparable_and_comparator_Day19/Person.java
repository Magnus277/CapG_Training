package comparable_and_comparator_Day19;
import java.lang.Comparable;

public class Person implements Comparable {
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
//	public int compareTo(Object o) {
//		Person p=(Person)o;
//		return this.name.compareToIgnoreCase(p.name);
//	}
	
	public int compareTo(Object o) {
		Person p=(Person)o;
		if(this.name.compareTo(p.name)!=0) {
			return this.name.compareTo(p.name);
		}
		else if(this.age-p.age!=0) {
			return this.age-p.age;
		}
		return 0;
	}
	
	
}
