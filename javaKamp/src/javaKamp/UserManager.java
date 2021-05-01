package javaKamp;

public class UserManager {
	public void add(User user) {
		System.out.println(user.firstName + " isimli kullanýcý kaydý oluþturuldu.");
	}
	
	public void update(User user) {
		System.out.println(user.firstName + " isimli kullanýcý kaydý güncellendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.firstName + " isimli kullanýcý kaydý silindi.");
	}
}
