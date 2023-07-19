package day10.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

	@Test
	public void testValidRegistration() {
		UserRegistration userRegistration = new UserRegistration();

		User user1 = new User(1, "John Doe", "john@example.com");
		User user2 = new User(2, "Jane Smith", "jane@example.com");

		// Registering user1 and user2 should not throw an exception
		assertDoesNotThrow(() -> userRegistration.register(user1));
		assertDoesNotThrow(() -> userRegistration.register(user2));

		// Ensure that both users are added to the list
		assertEquals(2, userRegistration.getUserCount());
	}

	@Test
	public void testInvalidRegistration() {
		UserRegistration userRegistration = new UserRegistration();

		User user1 = new User(1, "John Doe", "john@example.com");
		User user2 = new User(2, "Jane Smith", "jane@example.com");

		// Registering user1 and user2 first time (no exceptions expected)
		assertDoesNotThrow(() -> userRegistration.register(user1));
		assertDoesNotThrow(() -> userRegistration.register(user2));

		// Registering user1 again should throw UserAlreadyExistsException
		assertThrows(UserAlreadyExistsException.class, () -> userRegistration.register(user1));
	}
}
