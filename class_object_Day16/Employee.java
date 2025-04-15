package class_object_Day16;
import java.util.Objects;

public class Employee implements Cloneable{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	// @Override
	// public String toString() {
	// return id + " " + name + " " + salary;
	// }
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}
	//
	@Override
//	public boolean equals(Object o) {
//		Employee e = (Employee) o; // downcasting
//		return this.id == e.id && this.salary == e.salary
//				&& this.name.equals(e.name); // this.id=e2's id, e.id=e1's id
//	}
	
//	 public boolean equals(Object o) {
//	 if(o instanceof Employee) {
//	 Employee e=(Employee)o; //downcasting
//	 return this.id==e.id && this.salary==e.salary &&
//	 this.name.equals(e.name);
//	 }
//	 return false;
//	 }

		public int hashCode() {
	return (int)(this.id + this.salary + this.name.hashCode());
	}
		
		public Employee cloneEmployee(Employee e) {
		    try {
		        return (Employee) e.clone();
		    } catch (CloneNotSupportedException e1) {
		        // TODO Auto-generated catch block
		        e1.printStackTrace();
		    }
		    return null;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;  //other contains e2 since here downcasting is done
			return id == other.id && Objects.equals(name, other.name) //comparing the attributes of e1 and e2
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}
		
		
	
//	 public int hashCode() {
//	 return 1;
//	 }
		

}
