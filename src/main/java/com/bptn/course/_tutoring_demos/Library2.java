package com.bptn.course._tutoring_demos;

import java.util.ArrayList;

public class Library2 {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>();

		Book book1 = new Book("Harry Potter", "JK Rowling");
		Book book2 = new Book("Cinderella", "Walt Disney");
		Book book3 = new Book("Romeo & Juliet", "William Shakespeare");

		library.add(book1);
		library.add(book2);
		library.add(book3);
		for (Book book : library) {
			System.out.println(book.getAuthor());
		}

		System.out.println(library.getFirst().getTitle()); // == library.get(0);
		System.out.println(library.getLast().getTitle());

	}

}
