package day05.practice;

public class IciciATM implements ATM {

	@Override
	public boolean deposit(Account account, double amount) throws Exception {
		
		if(amount < 0) {
			
			throw new Exception("Amount cannot be zero");
		}

		account.setBalance(account.getBalance() + amount);

		return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {

		if (account.getBalance() < 10000) {

			throw new Exception("Minimum balance is 10000 Rs");
		}

		System.out.println("You have been charged Rs 10 for withdraw");
		account.setBalance(account.getBalance() - amount - 10);
		System.out.println("Balance: " + getBalance(account));

		return true;
	}

	@Override
	public double getBalance(Account account) {
		return account.getBalance();
	}

}
