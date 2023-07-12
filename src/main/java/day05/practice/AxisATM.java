package day05.practice;

public class AxisATM implements ATM {

	@Override
	public boolean deposit(Account account, double amount) throws Exception {

		if (amount < 0) {

			throw new Exception("Amount cannot be zero");
		}

		account.setBalance(account.getBalance() + amount);

		return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {

		if (account.getBalance() < 5000) {

			throw new Exception("Minimum balance is 5000 Rs");
		}

		System.out.println("You have been charged Rs 5 for withdraw");
		account.setBalance(account.getBalance() - amount - 5);
		System.out.println("Balance: " + getBalance(account));
		return true;
	}

	@Override
	public double getBalance(Account account) {
		return account.getBalance();
	}

}
