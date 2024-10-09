package com.bptn.course._17_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// C -> Create
		ArrayList<String> myBooks = new ArrayList<>();

		myBooks.add("Throne of Glass".toLowerCase());
		myBooks.add("Caraval".toLowerCase());
		myBooks.add("The Cruel Prince".toLowerCase());
		
		// Display all Books
		Iterator<String> iterator = myBooks.iterator();
		
		while(iterator.hasNext()) {
			String bookName = iterator.next();
			System.out.println(bookName);
		}

	}

}
