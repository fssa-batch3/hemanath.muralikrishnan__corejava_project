package day11.practice;

public class Task {

	private int id;
	private String name;
	private String status;

//	default constructor
	public Task() {

	}

//	parameterized constructor
	public Task(int id, String name, String status) {

		this.id = id;
		this.name = name;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString() {
		
		return "[ task_id = " + id + ", task_name = " + name + " , task_status = " + status  + " ]";
	}

}
