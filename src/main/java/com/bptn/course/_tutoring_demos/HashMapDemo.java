package com.bptn.course._tutoring_demos;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// Key is the title as a String, the value is the entire book object
		HashMap<String, Book> library = new HashMap<>();

		Book book1 = new Book("Harry Potter", "JK Rowling");
		Book book2 = new Book("Cinderella", "Walt Disney");
		Book book3 = new Book("Romeo & Juliet", "William Shakespeare");
		Book book4 = new Book("Cinderella", "Brother's Grimm");

		library.put("Harry Potter", book1);
		library.put("Cinderella", book2);
		library.put("Romeo & Juliet", book3);

		System.out.println(library);
		System.out.println(library.get("Cinderella").getAuthor());
		// library.get("Cinderella") = book2
		// book2.getAuthor();

//		library.put("Cinderella", book4);
//		System.out.println(library.get("Cinderella").getAuthor());

		library.putIfAbsent("Sleeping Beauty", book4);
		System.out.println(library.get("Sleeping Beauty").getAuthor());

		library.remove("Sleeping Beauty");
		System.out.println(library);

	}

}
