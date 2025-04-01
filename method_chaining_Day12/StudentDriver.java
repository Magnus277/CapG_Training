package method_chaining_Day12;

public class StudentDriver {
	public static void main(String[] args) {
		Student s=new Student();
//		System.out.println(s);  //returns ref variable address, not value!!!
//		System.out.println(s.setName("Deb"));
		
		s.setId(1).setName("Debayan").display();
	}
}
