package javaKamp;

public class StudentManager extends UserManager{

	public void add(Student student) {
		System.out.println(student.firstName + " isimli ��renci kayd� olu�turuldu.");
	}
	
	public void update(Student student) {
		System.out.println(student.firstName + " isimli ��renci kayd� g�ncellendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.firstName + " isimli ��renci kayd� silindi.");
	}
	
}
