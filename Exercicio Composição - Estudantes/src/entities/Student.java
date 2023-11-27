package entities;

import entities.enums.ApprovalStatus;

public class Student {
	private String name;
	private Double average;
	ApprovalStatus status;
	
	public Student(String name, Double average, ApprovalStatus status) {
		super();
		this.name = name;
		this.average = average;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public ApprovalStatus getStatus() {
		return status;
	}

	public void setStatus(ApprovalStatus status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Aluno:" + name + "\nAverage: " + average + "\nStatus: " + status;
	}
	
}