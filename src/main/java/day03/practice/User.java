package day03.practice;

public class User {

	private String name;
	private String emailid;

//	default constructor
	public User() {

	}

//	parameterized constructor

	public User(String name, String emailid) {

		this.name = name;
		this.emailid = emailid;
	}

//	get and set for name

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	get and set for email id

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

//	converting the object to string using to string method
//	and returning it
	public String toString() {

		return "Username = " + name + " , EmailId = " + emailid;
	}

}
