package day09.practice;

import java.time.*;
import java.util.*;

public class TaskWithPriority {

	private int id;
	private String name;
	private LocalDate deadline;
	private int priority;

//	default constructor
	public TaskWithPriority() {

	}

//	parameterized constructor
	public TaskWithPriority(int id, String name, LocalDate deadline, int priority) {

		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;
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

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

//	to string method to convert the object to string
	public String toString() {

		return this.id + " " + this.name + " " + this.deadline + " " + this.priority;
	}

}

//comparator for date

