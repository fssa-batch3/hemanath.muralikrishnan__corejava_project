package day10.practice;

public class Main {

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        try {
            User user1 = new User(1, "John Doe", "john@example.com");
            userRegistration.register(user1);

            User user2 = new User(2, "Jane Smith", "jane@example.com");
            userRegistration.register(user2);

            // This will throw an exception because the email ID "john@example.com" is already registered
            User user3 = new User(3, "Another User", "john@example.com");
            userRegistration.register(user3);
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
    }
}