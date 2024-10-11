package com.bptn.course._tutoring_demos;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arrayListDemo = new ArrayList<>();
		// No primitive types in Collections - we can use Integer, Float, Double,
		// objects, etc.

		arrayListDemo.add("Kyra".toLowerCase());
		arrayListDemo.add("Ola");
		System.out.println(arrayListDemo);

		System.out.println(arrayListDemo.contains("kyra")); // contains() returns a boolean
		System.out.println(arrayListDemo.get(0));
		System.out.println(arrayListDemo.size());

		arrayListDemo.set(0, "Chow");
		System.out.println(arrayListDemo);

		arrayListDemo.remove(0);
		System.out.println(arrayListDemo);

	}

}
