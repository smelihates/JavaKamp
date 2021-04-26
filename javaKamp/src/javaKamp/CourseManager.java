package javaKamp;

public class CourseManager {

	public void addToCourse(Course course) {
		System.out.println(course.name +" kursu oluþturuldu.");
	}
	public void updateToCourse(Course course) {
		System.out.println(course.name +" kursu güncellendi.");
	}
	
	public void addToCourseProgram(CourseProgram courseProgram) {
		
		System.out.println("Kurs programý oluþturuldu.");
	}
	
	public void updateToCourseProgram(CourseProgram courseProgram) {
		
		System.out.println("Kurs programý güncellendi.");
	}

}
