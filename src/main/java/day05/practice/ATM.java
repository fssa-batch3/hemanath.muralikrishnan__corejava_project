package day05.practice;

//Create an implementation of the below Interface
public interface ATM {

	boolean deposit(Account account, double amount) throws Exception;

	boolean withdraw(Account account, double amount) throws Exception;

	double getBalance(Account account);
}