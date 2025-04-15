package comparable_and_comparator_Day19;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Debayan", 400.56f);
		Employee e2 = new Employee(2, "Raj", 500.78f);
		
		compareBasedOnName(e1,e2);
		compareBasedOnId(e1,e2);
		compareBasedOnSalary(e1,e2);
	}
	
	public static void compareBasedOnName(Employee e1,Employee e2) {
		if(e1.compareTo(e2)>0) {
			System.out.println("e1 is greater");
		}
		
		else if(e1.compareTo(e2)<0) {
			System.out.println("e2 is greater");
		}
		else {
			System.out.println("e1 and e2 are equal");
		}
	}
	public static void compareBasedOnId(Employee e1,Employee e2) {
		CompareEmployeeById compareId=new CompareEmployeeById();
		
		if(compareId.compare(e1, e2)>0) {
			System.out.println("e1 is greater");
		}
		
		else if(compareId.compare(e1, e2)<0) {
			System.out.println("e2 is greater");
		}
		else {
			System.out.println("e1 and e2 are equal");
		}
	}
	public static void compareBasedOnSalary(Employee e1,Employee e2) {
		CompareBasedOnSalary compareSalary=new CompareBasedOnSalary();
		
		if(compareSalary.compare(e1, e2)>0) {
			System.out.println("e1 is greater");
		}
		
		else if(compareSalary.compare(e1, e2)<0) {
			System.out.println("e2 is greater");
		}
		else {
			System.out.println("e1 and e2 are equal");
		}
	}
}
