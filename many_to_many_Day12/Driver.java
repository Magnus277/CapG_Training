package many_to_many_Day12;

import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		
	
	Student s1=new Student("Debayan",3);
	Student s2=new Student("Rohit",3);
	
	Course c1=new Course("Java",3);
	Course c2=new Course("Python",4);
	Course c3=new Course("AIML",2);
	
	s1.addCourse(c1);
	s1.addCourse(c2);
	s2.addCourse(c3);
	s2.addCourse(c1);
	System.out.println(Arrays.toString(s1.arr)+"  "+Arrays.toString(s2.arr));

	String s="hello";
	char[] arr=s.toUpperCase().toCharArray(); 
	System.out.println(Arrays.toString(arr));	
	}
}