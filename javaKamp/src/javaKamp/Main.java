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
		
		Instructor instructor1 =new Instructor(1, "Engin", "Demiroð", "engin@engin.com", "MCT ,PMP ve ITIL ...");
		Instructor instructor2 =new Instructor(2, "Salih", "Demiroð", "salih@salih.com", "MCT  ve ITIL ...");
		
		InstructorManager manager=new InstructorManager();
		manager.add(instructor1);
		manager.add(instructor2);
		

		Student student1=new Student(1, "Melih", "Ateþ","melih@melih.com","AAA");
		Student student2=new Student(2, "Salih", "Ateþ","-","BBC");
		
		StudentManager manager2=new StudentManager();
		
		manager2.add(student1);
		manager2.add(student2);
		
		
		
		
	}
	

}
