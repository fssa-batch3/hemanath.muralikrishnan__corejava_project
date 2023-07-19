package day10.misc;

//	unchecked exception throws an error at run time

public class UnCheckedException {

	public static int divide(int a, int b) throws IllegalArgumentException {

		if (b == 0) {

			throw new IllegalArgumentException("Divisor can't be zero");
		}

		return a / b;
	}

	public static void main(String[] args) {

		System.out.println("Result:" + divide(10, 10));

	}
}
