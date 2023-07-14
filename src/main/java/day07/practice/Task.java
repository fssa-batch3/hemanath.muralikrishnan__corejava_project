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

}
