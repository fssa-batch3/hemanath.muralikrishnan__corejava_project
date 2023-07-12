package day05.practice;

public class Student {
	private String name;
	private int id;
	Department department;

//	default constructor
	public Student() {

	}

//	parameterized constructor
	public Student(String name, int id, Department dept) {
		this.name = name;
		this.id = id;
		this.department = dept;
	}

//	get and set for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	get and set for id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	get and set department
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String toString() {

		return "Student Name = " + name + " , id = " + id;
	}

}
