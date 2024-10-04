package com.bptn.course._06_oop;

class TechDepartment extends Department{
	
	private double totalPurchaseAmount;

	public TechDepartment(String departmentName, int numEmployees, double totalPurchaseAmount) {
		super(departmentName, numEmployees);
		this.totalPurchaseAmount = totalPurchaseAmount;
	}

}
