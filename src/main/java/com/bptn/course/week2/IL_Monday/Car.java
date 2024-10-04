package com.bptn.course.week2.IL_Monday;

class Car {
	// Fill in the code for Step 2
	// Create instance variables
	private String color;
	private String brand;
	private int price;
	
	//create constructor and pass color, brand, and price
    public Car(String color, String brand, int price) {
      // Fill in the code for Step 4
    	// Use this keyword to assign constructor arguments to class instance variables
    	this.color = color;
    	this.brand = brand;
    	this.price = price;

    }


    void printCarDetails() {
    	// Call print function
        this.print();
  }

  // Fill in the code
    // Create method that prints the color, brand, and price of the car
  private void print() {
       // fill in code
	  System.out.println("Car{" +
              "color='" + color + '\'' +
              ", brand='" + brand + '\'' +
              ", price=" + price +
              '}');
   }
}
/* SUMMARY
 * In this task, we create a class named Car, and assign it the attributes color, brand
 * and price. We then create a method that prints out these details, and another method 
 * that calls the print function. What is new about this task, is having multiple
 * methods, a constructor, and using this keyword. In the past week, we have yet to
 * work on multi-method classes, or multi-class programs. Something I will have to make
 * sure I remember in the future is the proper header needed for each part of the code.
 * Mixing up the structure of the constructor header, with the structure of the method
 * constructor can lead to bugs, but they are very similar. So keeping an eye out on that
 * is important.
 */
