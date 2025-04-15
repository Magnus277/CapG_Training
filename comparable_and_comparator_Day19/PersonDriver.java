package comparable_and_comparator_Day19;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1=new Person("Debayan", 22);
		Person p2=new Person("Debayan", 23);
		
		if(p1.compareTo(p2)>0) {
			System.out.println("p1 is greater");
		}
		
		else if(p1.compareTo(p2)<0) {
			System.out.println("p2 is greater");
		}
		else {
//			CompareBasedOnAge(p1,p2);
			
		}
	}
	
	public static void CompareBasedOnAge(Person p1,Person p2) {
		CompareBasedOnAge compareAge= new CompareBasedOnAge();
		if(compareAge.compare(p1,p2)>0){
			System.out.println("p1 is greater");
		}
		else if(compareAge.compare(p1,p2)<0){
			System.out.println("p2 is greater");
		}
		else {
			System.out.println("equal");
		}
	}
}
