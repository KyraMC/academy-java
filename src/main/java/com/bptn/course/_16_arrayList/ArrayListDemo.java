package com.bptn.course._16_arrayList;

import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// C -> Create
		// Created an ArrayList that will only take in Strings
		// Making it type-safe
		ArrayList<String> groceries = new ArrayList<>(); // By default makes storage for 10 objects
		
		groceries.add("Milk");
		groceries.add("Bread");
		groceries.add("Eggs");
		
		// R -> Read
		System.out.println("Grocery List: " + groceries);
		System.out.println(groceries.get(2));
		System.out.println(groceries.getLast());
		System.out.println(groceries.getFirst());
		
		// U -> Update
		groceries.set(1, "Coffee");
		System.out.println("Grocery List: " + groceries);
		// groceries.set(4, "Sugar"); // Doesn't work because index out of bounds and would affect insertion order
		
		// D -> Delete
		groceries.remove(2);
		System.out.println("Grocery List: " + groceries);
	}

}
