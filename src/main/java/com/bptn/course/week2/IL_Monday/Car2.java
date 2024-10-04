package com.bptn.course.week2.IL_Monday;

class Car2 {
	//Declare a String color, String brand, int price
	private String color;
	private String brand;
	private int price;

    public Car2() {
    	// calls the parameterized constructor
    }

	public Car2 (String color, String brand, int price) {
		//Assign Constructor parameters String color, String brand, and int price to Class variables with the this keyword.
	    this();
		this.color = color;
	    this.brand = brand;
	    this.price = price;
    }

    void printCarDetails() {
        this.print();
    }

    private void print() {
        System.out.println("Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}'
        );
    }
}

/* SUMMARY
 * This program is similar to the previous one except we have two constructors; one with
 * parameters and one without. The parameterized constructor is similar to what we did
 * before except it has the keyword this(); before the assigning of parameters. This is 
 * needed so that the default constructor can call the parameterized constructor with
 * default values.
 */
