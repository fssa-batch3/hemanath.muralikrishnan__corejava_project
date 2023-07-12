package day05.practice;

//Change the below class to have setters and Getters and Constructors
public class Account {
	String accNo;
	double balance;

//	default constructor
	public Account() {

	}

//	parameterized constructor
	public Account(String accNo, double balance) {

		this.accNo = accNo;
		this.balance = balance;
	}

//	get and set for account no

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

//	get the set for balance

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String toString() {

		return "AccNo = " + accNo + ", Balance = " + balance;
	}

}
