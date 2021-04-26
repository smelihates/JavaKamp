package javaKamp;

import java.sql.Date;

public class CourseProgram {

	public CourseProgram(int id, int courseId, int partId, Date date, String subject, String description) {
		this.id=id;
		this.courseId=courseId;
		this.partId=partId;
		this.date=date;
		this.subject=subject;
		this.description=description;
	}
	
	int id;
	int courseId;
	int partId;
	Date date;
	String subject;
	String description;
	
}
