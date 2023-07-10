package day03.practice;

public class TestUser {

	public static void main(String[] args) {
		
//		creating object with parameterized constructor

		User user1 = new User("Hemanath", "hemanathm4@gmail.com");

//		creating object with default constructor
//		and initialize the attributes
		User user2 = new User();
		user2.setName("HemanathMuralikrishnan");
		user2.setEmailid("hemanath7867@gmail.com");

//		printing the object has string
		System.out.println(user1);
		System.out.println(user2);

	}
}
