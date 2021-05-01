package javaKamp;

public class StudentManager extends UserManager{

	public void add(Student student) {
		System.out.println(student.firstName + " isimli öðrenci kaydý oluþturuldu.");
	}
	
	public void update(Student student) {
		System.out.println(student.firstName + " isimli öðrenci kaydý güncellendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.firstName + " isimli öðrenci kaydý silindi.");
	}
	
}
