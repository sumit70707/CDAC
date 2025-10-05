package com.sms.core;

import java.time.LocalDate;

import com.sms.constant.Coursefield;

public class Student {

	private int id;
	private String name;
	private String email;
	private int marks;
	private Coursefield course;
	private LocalDate date;
	private static int counter;

	public Student(String name, String email, int marks, Coursefield course, LocalDate date) {
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.course = course;
		this.date = date;
		this.id = counter++;
	}
	
	
	public Student(String email) {
		this.email = email;
	}

	public Student(Coursefield course) {
		this.course = course;
	}


	public Coursefield getCourse() {
		return course;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			return this.email.equals(((Student)obj).email);
		}
		return false;
	}



	@Override
	public String toString() {
	
		return "\n Student [id=" + id + ", name=" + name + ", email=" + email + ", marks=" + marks + ", course=" + course
				+ ", date=" + date + "] ";
	}
	
	

}
