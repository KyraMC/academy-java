package com.bptn.course.challenge_oct_09;

import java.util.ArrayList;
import java.util.List;

class University {

	// property - get inspired by the UML diagram
	ArrayList<Student> students = new ArrayList<>();

	public void addStudent(Student s) {
		// add a student to the "university" arraylist
		students.add(s);
	}

	public Student getStudent(long studentId) {
		// get the first student in the university that has the studentId. (ideally,
		// this would be unique, so you can stop searching after finding the fist match)
		Student output = null;
		for (Student stu : students) {
			if (stu.getStudentId() == studentId) {
				output = stu;
			}
		}
		return output;
	}

	public List<Student> searchStudent(String userNamePrefix) {
		// return all students that have usernames beginning with the prefix
		List<Student> output = new ArrayList<>();
		for (Student stu : students) {
			if (stu.getUserName().startsWith(userNamePrefix)) {
				output.add(stu);
			}
		}
		return output;

	}

	public boolean deleteStudent(long studentId) {
		// return if a successful deletion happened
		boolean success = false;
		for (Student stu : students) {
			if (stu.getStudentId() == studentId) {
				success = students.remove(stu);
			}
		}
		return success;
	}

}
