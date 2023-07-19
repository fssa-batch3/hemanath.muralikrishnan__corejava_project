package day10.practice;

// I am extending from the run time exception because user can valid or invalid
// input we only in the run time only so

public class InvalidEmailException extends RuntimeException {

	private static final long serialVersionUID = -8105491977357554060L;

	// Calling each super constructors for each of the types
	public InvalidEmailException(String msg) {
		super(msg);
	}

	public InvalidEmailException(Throwable te) {
		super(te);
	}

	public InvalidEmailException(String msg, Throwable te) {
		super(msg, te);
	}
}
