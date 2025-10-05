package com.sms.validation;

import java.time.LocalDate;
import java.util.List;

import com.sms.constant.Coursefield;
import com.sms.core.Student;
import com.sms.exceptionhandling.SMSException;

public class SMSValidation {
	public static Student validateALL(String name, String email, int marks, String course, String date,
			List<Student> students) throws SMSException {

		validateEmail(email, students);
		Coursefield c = validateCourse(marks, course, students);

		return new Student(name , email , marks, c ,LocalDate.parse(date));

	}

	private static Coursefield validateCourse(int marks, String course, 
			List<Student> students) throws SMSException , IllegalArgumentException {
		Coursefield c = Coursefield.valueOf(course.toUpperCase());
		if (c.getMaxCapacity() > 0) {
			if (c.getMinMarks() < marks) {
				return c;
			} else {
				throw new SMSException("Marks should be greateerr than 60 !!!");
			}
		} else {
			throw new SMSException("!!! Seat Full  Try again next batch !!!");
		}

	}


	public static void validateEmail(String email, List<Student> students) throws SMSException {

		String emailRegEx = "^[a-z][a-z0-9._-]*@[a-z]+\\.(com|org|net)$";
		if (email.matches(emailRegEx)) {

			Student s = new Student(email);
			if (students.contains(s)) {
				throw new SMSException("Email Already exist ");
			}
		} else {
			throw new SMSException("!!! Invalid Email !!!");
		}

	}

}
