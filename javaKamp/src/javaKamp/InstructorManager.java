package javaKamp;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.firstName + " isimli eðitmen kaydý oluþturuldu.");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.firstName + " isimli eðitmen kaydý güncellendi.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.firstName + " isimli eðitmen kaydý silindi.");
	}
}
