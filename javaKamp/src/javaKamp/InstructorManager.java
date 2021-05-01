package javaKamp;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.firstName + " isimli e�itmen kayd� olu�turuldu.");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.firstName + " isimli e�itmen kayd� g�ncellendi.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.firstName + " isimli e�itmen kayd� silindi.");
	}
}
