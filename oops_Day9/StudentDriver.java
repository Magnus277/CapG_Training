package oops_Day9;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1=new Student(1,"Deb","UEM",56.54);
		System.out.println(s1.collegeName+" "+s1.id+" "+s1.marks+" "+s1.name);
		
		Student s2=new Student(2,"Deb2","IEM",96.54);
		System.out.println(s2.collegeName+" "+s2.id+" "+s2.marks+" "+s2.name);
		
		Student s4=new Student();
		Student s3=new Student(3,"Deb3");
		System.out.println(s3.collegeName+" "+s3.id+" "+s3.marks+" "+s3.name);
		

//		s1.id=16;
//		s1.name="Debayan";
//		s1.marks=98;
//		s1.collegeName="UEM";
//		System.out.println(s1.collegeName+" "+s1.id+" "+s1.marks+" "+s1.name);
//		s1.studying();
//		System.out.println("---------------------------------------");
//		Student s2=new Student();
//		s2.id=1;
//		s2.name="Deb";
//		s2.marks=90.68;
//		s2.collegeName="UEM";
//		System.out.println(s2.collegeName+" "+s2.id+" "+s2.marks+" "+s2.name);
//		s2.studying();
		
		Employee e=new Employee();
	}
}
