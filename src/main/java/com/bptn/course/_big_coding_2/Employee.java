package com.bptn.course._big_coding_2;

class Employee {
	// Instance variable to store salary
	private int salary;
	
	// Instance variable to store hours per day worked by employee
	private int hoursPerDay;
	
	// Constructor to set instance variables(salary and hoursPerDay) value
	Employee(int salary, int hoursPerDay){
		this.salary = salary;
		this.hoursPerDay = hoursPerDay;
	}
	// Set method to update salary
	void setSalary() {
		if(salary < 500) {
			salary += 10;
		}
	}
	// Set method to update hoursPerDay
	void setHoursPerDay() {
		if(hoursPerDay > 6) {
			salary += 5;
		}
	}

	// Get method to return salary
	int getSalary() {
		setSalary();
		setHoursPerDay();
		return salary;
	}
}
