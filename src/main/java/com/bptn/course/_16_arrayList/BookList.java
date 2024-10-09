package com.bptn.course._16_arrayList;

import java.util.ArrayList;
public class BookList {

	public static void main(String[] args) {
		// C -> Create
		ArrayList<String> myBooks = new ArrayList<>();
		
		myBooks.add("Throne of Glass".toLowerCase());
		myBooks.add("Caraval".toLowerCase());
		myBooks.add("The Cruel Prince".toLowerCase());
		
		// R -> Read
		System.out.println("My favourite books are: " + myBooks);
		for (String book: myBooks) {
			System.out.println("Book: " + book);
		}
		
		System.out.println("The first book is: " + myBooks.get(0));
		System.out.println("The first book is: " + myBooks.getFirst());
		
		// D -> Delete
		myBooks.remove(1);
		System.out.println("My favourite books are: " + myBooks);
		
		// Searching
		if(myBooks.contains("The Cruel Prince".toLowerCase())) {
			System.out.println("Book found");
		}else {
			System.out.println("Book not found");
		}
		
		System.out.println("My size of the list is: " + myBooks.size());
		System.out.println("My last book in the list is: " + myBooks.get(myBooks.size()-1));
	}

}
