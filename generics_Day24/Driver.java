package generics_Day24;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		Student<Person> student=new Student<Person>(new Person(10,"Rohit"));
//		printDetails(student);
		
//		List<Boolean> list=new ArrayList<Boolean>(); //error since boolean is not a subclass of Number
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		
//		print(list);
		
		List<Number> list=new ArrayList<Number>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
//		print(list);
		
		List<Number> ls=new ArrayList<Number>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
//		printData(ls);
		printList(list);
		
	}
	
	public static void printDetails(Student<? extends Person> student) {
		Person p=student.obj;
//		student.obj=new Person(10,"ram");
		System.out.println(p);
		
	}
	
	public static void print(List<? extends Number>list) { //number type or child classes of number type
//		list.add(true); //read only,cant write
		System.out.println(list.get(0));
	}
	public static void printData(List<? super Number>list) { //number type or super classes of number type
		list.add(50); //can write
		System.out.println(list.get(0));
	}
	public static void printList(List<?>list){
		System.out.println(list);
	}
}
