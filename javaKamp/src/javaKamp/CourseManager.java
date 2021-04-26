package javaKamp;

public class CourseManager {

	public void addToCourse(Course course) {
		System.out.println(course.name +" kursu olu�turuldu.");
	}
	public void updateToCourse(Course course) {
		System.out.println(course.name +" kursu g�ncellendi.");
	}
	
	public void addToCourseProgram(CourseProgram courseProgram) {
		
		System.out.println("Kurs program� olu�turuldu.");
	}
	
	public void updateToCourseProgram(CourseProgram courseProgram) {
		
		System.out.println("Kurs program� g�ncellendi.");
	}

}
