package com.bptn.course._06_oop;

class SalesDepartment extends Department{
	private double totalSalesAmount;
	
	public SalesDepartment(String departmentName, int numEmployees, double totalSalesAmount) {
		super(departmentName, numEmployees);
		this.totalSalesAmount = totalSalesAmount;
		
	}
}
