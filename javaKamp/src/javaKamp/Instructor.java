package javaKamp;

public class Instructor extends User {
	String description;
	
	public Instructor(int id, String firstName, String lastName, String email, String description) {
		super(id, firstName, lastName, email);
		this.description=description;
	}


}
