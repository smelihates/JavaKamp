package javaKamp;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(1, "Programlamaya Giri� ��in Temel Kurs","PYTHON, JAVA, C# gibi ...");
		Course course2=new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "");
		Course course3=new Course(3, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "");
		
		Course[] courses={course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println("Kurs ad� : " +course.name);
		}
		
		Teacher teacher1=new Teacher(1, "Engin Demiro�", "Microsoft Certified Trainer (MCT) ,PMP ve ITIL... ");
		Teacher teacher2=new Teacher(2, "Salih Demiro�", "... ");
		
		Teacher[] teachers= {teacher1,teacher2};
		
		for (Teacher teacher : teachers) {
			System.out.println("E�itimci ad� : " + teacher.name);
		}
		
		Student student1=new Student(1, "Melih Ate�");
		Student student2=new Student(2, "Salih Ate�");
		
		Student[] students= {student1,student2};
		
		for (Student student : students) {
			System.out.println("��renci ad� : "+ student.name);
		}
		
		
		
		
	}
	

}
