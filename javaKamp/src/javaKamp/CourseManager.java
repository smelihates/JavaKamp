package javaKamp;

public class CourseManager {

	public void addToCourse(Course course) {
		System.out.println(course.name +" kursu oluşturuldu.");
	}
	public void updateToCourse(Course course) {
		System.out.println(course.name +" kursu güncellendi.");
	}
	
	public void addToCourseProgram(CourseProgram courseProgram) {
		
		System.out.println("Kurs programı oluşturuldu.");
	}
	
	public void updateToCourseProgram(CourseProgram courseProgram) {
		
		System.out.println("Kurs programı güncellendi.");
	}

}
