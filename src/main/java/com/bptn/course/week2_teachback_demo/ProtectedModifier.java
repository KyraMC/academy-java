package com.bptn.course.week2_teachback_demo; //Same packages as Main

public class ProtectedModifier {
	
	// Protected so we can access in same package or through other packages if a subclass
	
	protected int proInt;
	
	
	// Constructor
	protected ProtectedModifier(int proInt) {
		this.proInt = proInt;
	}
	
	// getter
	protected int getProInt() {
		return proInt;
	}
	
	// print method
	protected void protectPrint() {
		System.out.println("This is proInt: " + proInt);
	}
}
