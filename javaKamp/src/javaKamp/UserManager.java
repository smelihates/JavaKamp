package javaKamp;

public class UserManager {
	public void add(User user) {
		System.out.println(user.firstName + " isimli kullan�c� kayd� olu�turuldu.");
	}
	
	public void update(User user) {
		System.out.println(user.firstName + " isimli kullan�c� kayd� g�ncellendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.firstName + " isimli kullan�c� kayd� silindi.");
	}
}
