package oops_Day9;

public class EmpDriver {
	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee(1);
		System.out.println("id= "+emp2.id);
		Employee emp3=new Employee(2,"Deb");
		System.out.println("id= "+emp3.id+" Name: "+emp3.name);
		Employee emp4=new Employee(3,"Deb2",3000);
		System.out.println("id= "+emp4.id+" Name: "+emp4.name+" Salary: "+emp4.salary);
		Employee emp5=new Employee(4,"Deb3",4000,"Capg");
		System.out.println("id= "+emp5.id+" Name: "+emp5.name+" Salary: "+emp5.salary+" Company Name: "+emp5.companyName);
	}
}
