package com.bptn.course._18_linkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// Create
		LinkedList<String> myList = new LinkedList<>();
		
		// Insert
		myList.add("Test1");
		myList.add("Test2");
		myList.add("Test3");
		myList.addFirst("Test0");
		myList.add("Test1");
		myList.addLast("Test10");
		myList.add(2, "Test4");
		
		System.out.println(myList);
		
		// Read
		Iterator<String> iterator = myList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Delete
		myList.remove();
		myList.remove(2);
		myList.removeFirstOccurrence("Test1");
		System.out.println(myList);

	}

}
