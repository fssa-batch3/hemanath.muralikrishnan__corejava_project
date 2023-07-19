package day10.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailValidatorTest {

	@Test
	public void testValidEmails() {
		// Valid email addresses
		String[] validEmails = { "test@example.com", "my.mail@example.co.uk", "some.email@domain.io",
				"test123@example.com", "name+surname@example.com" };

		for (String email : validEmails) {
			assertTrue(EmailValidator.isValidEmail(email));
		}
	}

	@Test
	public void testInvalidEmails() {
		// Invalid email addresses
		String[] invalidEmails = { null, "", "invalid_email", "noat.symbol.com", "missing.domain@.com",
				"double..dots@example.com", "name@domain", "name@domain.", "@domain.com" };

		for (String email : invalidEmails) {
			assertThrows(InvalidEmailException.class, () -> EmailValidator.isValidEmail(email));
		}
	}
}
