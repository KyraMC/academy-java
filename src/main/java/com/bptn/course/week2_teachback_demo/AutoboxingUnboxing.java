package com.bptn.course.week2_teachback_demo;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
//		Integer i = new Integer(10); // Don't need to do this if using Java 9+
//		int primI = i.intValue(); // Don't need to do this, Java will automatically convert to primitive value
		
		Integer wrapInt = 10; //Autoboxing
		int primInt = wrapInt; //Unboxing
		
		
		Double wrapDouble = 5.2; //Autoboxing
		double primDouble = wrapDouble; // Unboxing
		
		
		Character wrapChar = 'A';//Autoboxing
		char primChar = wrapChar; //Unboxing
		
		// When you print out the primitive and wrapper, you get the same values because Java will automatically get the value of the wrapper classes
		System.out.println(primInt);
		System.out.println(wrapInt);
		
		// Can call methods on wrapper classes but cannot do it with primitive values	
		System.out.println(wrapDouble.equals(wrapInt));
//		System.out.println(primDouble.equals(primInt));

		
		// Calling static constants on wrapper classes but cannot do it with primitives
		System.out.println(Integer.MIN_VALUE);
//		System.out.println(int.MIN_VALUE);

//		
		// Can use wrapper classes to convert Strings to primitive types
		int stringInt = Integer.parseInt("123");
		System.out.println(stringInt);
		
		
	}

}
