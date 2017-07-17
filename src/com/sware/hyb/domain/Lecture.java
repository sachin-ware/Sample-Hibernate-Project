package com.sware.hyb.domain;

public class Lecture {

	
	int lecture_id;
	String subject;
	float lectureTime;

	public Lecture(int lecture_id, String subject, float lectureTime) {
		super();
		this.lecture_id = lecture_id;
		this.subject = subject;
		this.lectureTime = lectureTime;
	}
	
	public Lecture() {
		// TODO Auto-generated constructor stub
	}
	public int getLecture_id() {
		return lecture_id;
	}
	public void setLecture_id(int lecture_id) {
		this.lecture_id = lecture_id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public float getLectureTime() {
		return lectureTime;
	}
	public void setLectureTime(float lectureTime) {
		this.lectureTime = lectureTime;
	}

}
