package javaKamp;

public class Student extends User {
	String schoolName;
	
	public Student(int id, String firstName, String lastName, String email, String schoolName) {
		super(id, firstName, lastName, email);
		this.schoolName=schoolName;
	}

	

}
