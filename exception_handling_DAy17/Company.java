package exception_handling_DAy17;

public class Company {
//	Company c=new Company(); --->will give stack overflow error as non st variables and methods get loaded when creating object
	static Company c=new Company();
	Company(){
		
	}
	
	public static void main(String[] args) {
		
		Company c=new Company();
	}
	}

