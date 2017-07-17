package com.sware.hyb.domain;

public class Student {
	private int rollNo;
	private String name;
	private String course;
	private float marks;
	
	public Student(int rollNo, String name, String course, float marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}

}
