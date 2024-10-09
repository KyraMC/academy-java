package com.bptn.course._15_generics;

public class GenericsDemo {
	// Creates a generic print array method that works on arrays of any object
	// T is a placeholder for the type of data
	// static because we aren't making an object of the class
	public static<T> void printArray(T[] array) {
		for(T element: array) {
			System.out.println(element);
		}
		
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3};
		printArray(intArray);
		
		String[] stringArray = { "Hello", "Hi", "Bye" };
		printArray(stringArray);
	}

}
