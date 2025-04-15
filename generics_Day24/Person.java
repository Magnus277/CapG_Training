package generics_Day24;

public class Person<T> {
	int id;
	private String name;
	
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return id+name;
	}
}
