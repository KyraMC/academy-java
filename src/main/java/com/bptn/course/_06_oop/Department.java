package com.bptn.course._06_oop;

class Department {
	private String departmentName;
	private int numEmployees;

	public Department(String departmentName, int numEmployees) {
		this.departmentName = departmentName;
		this.numEmployees = numEmployees;
	}
	
	public void departmentInfo() {
		System.out.println("Department Name: " + departmentName);
		System.out.println("Number of Employees: " + numEmployees);
	}
}

