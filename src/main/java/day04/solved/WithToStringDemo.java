package day04.solved;

public class WithToStringDemo {
	public static void main(String[] args) {
		// create Account using Setter methods and Default constructor
		Account4 acct1 = new Account4();
		acct1.setAccNo("A101");
		acct1.setName("Naresh");
		acct1.setBalance(1000);
		
		System.out.println(acct1);
	}
}
