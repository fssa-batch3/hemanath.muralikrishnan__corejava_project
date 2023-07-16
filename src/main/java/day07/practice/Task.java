package day07.practice;

import java.time.LocalDate;

public class Task {

	private int id;
	private String name;
	private LocalDate deadline;

//	default constructor
	public Task() {

	}

//	parameterized constructor
	public Task(int id, String name, LocalDate deadline) {

		this.id = id;
		this.name = name;
		this.deadline = deadline;
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

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

//	equals method to 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Task other = (Task) obj;
		return name.equals(other.name) && deadline.equals(other.deadline);
	}

	@Override
	public int hashCode() {
		return 31 * name.hashCode() + deadline.hashCode();
	}

}
