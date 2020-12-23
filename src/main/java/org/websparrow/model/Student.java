package org.websparrow.model;

public class Student {

	// Generate Getters and Setters...
	private String rollNo;
	private String name;
	private String course;
	private String college;

	public Student(String rollNo, String name, String course, String college) {

		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.college = college;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}
