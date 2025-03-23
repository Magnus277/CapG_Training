package encapsulation_Day10;

import java.util.Scanner;

public class StudentManagementSystem {

	public void getEmail_id(int password) {
		if(this.password==password)
		System.out.println(email_id); 
	}

	public void setEmail_id(String email_id, int password, String newEmail_id) {
		if (this.password == password && this.email_id==email_id) {
			this.email_id = newEmail_id;
		} else {
			System.out.println("Invalid password!");
		}
	}

	public void getPassword() {
		System.out.println(password);
	}

	public void setPassword(String email_id, int password) {
		if (this.email_id==email_id) {
			this.password = password;
		} else {
			System.out.println("Invalid password!");
		}
	}

	public void getAge(int password) {
	    if (this.password == password) {
	        System.out.println(age);
	    } else {
	        throw new SecurityException("Incorrect password");
	    }
	}


	public void setAge(int password, int age) {
		if (this.password == password) {
			this.age = age;

		} else {
			System.out.println("Invalid password!");
		}
	}

	public void getName(int password) {
		if(this.password==password)
			System.out.println(name);
		
		else
			System.out.println("Invalid password");
	}
	
	public void setName(int password, String name) {
		if (this.password == password) {
			this.name = name;

		} 
		else {
			System.out.println("Invalid password!");
		}
	}


	public void getGender(int password) {
		if(this.password==password)
		System.out.println(gender);
	}

	public void setGender( int password, String gender) {
		if (this.password == password ) {
			this.gender = gender;
		} 
		else {
			System.out.println("Invalid password!");
		}
	}

	public void getBranch(int password) {
		if(this.password==password)
			System.out.println(branch);
			}

	public void setBranch(int password, String branch) {
		if (this.password == password) {
			this.branch = branch;

		} 
		else {
			System.out.println("Invalid password!");
		}
	}
	
	public void updatePassword(int password) {
		
		if (this.password == password) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter new pass: ");
			int newPassword=sc.nextInt();
			System.out.println("confirm new pass");
			int confirmPassword=sc.nextInt();
			if(newPassword==confirmPassword) {
			password=newPassword;
			System.out.println("Your password has been updated!");
			}
			else
				System.out.println("Password didnt match!");
		} 
		else 
			System.out.println("Invalid password!");
		

	}
	
public void studentDetails(String email_id, int password) {
		
		if (this.password == password && this.email_id==email_id) {
			getName(1234);
			System.out.println(gender);
			System.out.println(age);
			System.out.println(branch);
			System.out.println(email_id);

		} 
		else {
			System.out.println("Invalid password!");
		}

	}

private String name = "Debayan";
private int age = 22;
private String gender = "Male";
private String branch = "CSE";
private String email_id = "ddebayan29@gmail.com";
private int password = 1234;
}
