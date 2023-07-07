package day02.practice;

public class UserDetails {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(200);
		user.setName("HemanathM");
		user.setEmailid("hemanath7867@gmail.com");
		user.setPassword("12@Hemanath");
		
		System.out.println("User Id: "+user.getId());
		System.out.println("User Name: "+user.getName());
		System.out.println("User EmailId: "+user.getEmailid());
		System.out.println("User Password: "+user.getPassword());
	}
}
