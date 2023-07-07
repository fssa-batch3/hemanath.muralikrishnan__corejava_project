package day02.practice;

class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		// TODO complete this code using the above template
		System.out.println("INFO: "+msg);
	}
	
	public static void error (String msg) {
		// TODO complete this code using the above template
		System.out.println("ERROR: "+msg);
	}
	
	public static void debug (int num) {
		// TODO Complete this code
		System.out.println("DEBUG: "+num);
	}
	
	// Similarly write overloaded methods for error and info.
	
	public static void info (int num) {
		
		System.out.println("INFO: "+num);
	}
	
	public static void error (int num) {
		
		System.out.println("ERROR: "+num);
	}
}

public class LoggerClass {

	public static void main(String[] args) {
		
		Logger.debug("Debug completed");
		Logger.debug(20);
		Logger.info("Program 1");
		Logger.info(40);
		Logger.error("Error thrown");
		Logger.error(60);
		
	}
}
