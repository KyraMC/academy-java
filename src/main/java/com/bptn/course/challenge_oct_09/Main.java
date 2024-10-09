package com.bptn.course.challenge_oct_09;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Start by looking in the University and Student classes. Implement the
		// methods.

		// Create a bunch of student objects
		// (Make sure one student has the following studentId: 123)
		// (Make sure one other student has the following username: testUsername1)
		Date d1 = new Date(2000, 10, 14);
		Date d2 = new Date();
		Date d3 = new Date(2000, 9, 21);

		Student stu1 = new Student(123, "username", "password", "First", "Last", "blah@gmail.com", "123-456-7890",
				"123 Sesame street", "female", d1, d2, 1234567890, "curriculum 1");

		Student stu2 = new Student(456, "testUsername1", "password2", "First2", "Last2", "blah2@gmail.com",
				"098-765-4321", "123 Waverly Place", "male", d3, d2, 987654321, "curriculum 2");

		// Create instance of university called "university" and populate it with the
		// students.
		University university = new University();
		university.addStudent(stu1);
		university.addStudent(stu2);

		System.out.println("\nUniversity ------ \n" + university.students);
		System.out.println("\nGetting student------\n" + university.getStudent(123));
		System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
		System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

		System.out.println("\nUniversity ------ \n" + university.students);

	}

}
