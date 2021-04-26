package javaKamp;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(1, "Programlamaya Giriþ Ýçin Temel Kurs","PYTHON, JAVA, C# gibi ...");
		Course course2=new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "");
		Course course3=new Course(3, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "");
		
		Course[] courses={course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println("Kurs adý : " +course.name);
		}
		
		Teacher teacher1=new Teacher(1, "Engin Demiroð", "Microsoft Certified Trainer (MCT) ,PMP ve ITIL... ");
		Teacher teacher2=new Teacher(2, "Salih Demiroð", "... ");
		
		Teacher[] teachers= {teacher1,teacher2};
		
		for (Teacher teacher : teachers) {
			System.out.println("Eðitimci adý : " + teacher.name);
		}
		
		Student student1=new Student(1, "Melih Ateþ");
		Student student2=new Student(2, "Salih Ateþ");
		
		Student[] students= {student1,student2};
		
		for (Student student : students) {
			System.out.println("Öðrenci adý : "+ student.name);
		}
		
		
		
		
	}
	

}
