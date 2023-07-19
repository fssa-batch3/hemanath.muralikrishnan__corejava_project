package day10.misc;

// checked exception shows an error before we compile it

public class CheckedException {

	public static int divide(int a, int b) throws IllegalArgumentException {

		if (b == 0) {

			throw new IllegalArgumentException("Divisor can't be zero");
		}

		return a / b;
	}

	public static void main(String[] args) {

//		showing the error here
		System.out.println(divide(10, 0));

	}
}
