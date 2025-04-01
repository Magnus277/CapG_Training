package many_to_many_Day12;

public class Course {
	String coursename;
	Student[] students;
	
	Course(String coursename,int size){
		this.coursename=coursename;
		this.students=new Student[size];
	}
}
