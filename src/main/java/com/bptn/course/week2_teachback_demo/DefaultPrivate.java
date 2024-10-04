package com.bptn.course.week2_teachback_demo;

class DefaultPrivate { // default class

	// Declare class variables
	int defaultInt; // default - Can access in same class or package
	private int privInt; // private - Can access only in same class

	DefaultPrivate(int defaultInt, int privInt) { // default constructor
		this.defaultInt = defaultInt;
		this.privInt = privInt;
	}

	// GETTER METHODS
	int getDefaultInt() { // default
		return defaultInt;
	}

	private int getPrivInt() { // private
		return privInt;
	}

	// PRINT METHODS
	void defaultPrint() { // default
		System.out.println("This is class variable defaultInt: " + defaultInt);
		System.out.println("This is getter method : " + getDefaultInt());
		
		privPrint();
	}
	
	private void privPrint() { // private
		System.out.println("This is class variable privInt: " + privInt);
		System.out.println("This is getter method : " + getPrivInt());
	}

}
