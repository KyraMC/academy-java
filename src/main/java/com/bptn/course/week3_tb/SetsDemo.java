package com.bptn.course.week3_tb;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {
		String username1 = "Kyra123";
		String username2 = "Happiness456";
		String username3 = "Olu789";

		// HashSet - Unique items, no order
		HashSet<String> followers = new HashSet<>();

		// Add followers
		followers.add(username1);
		followers.add(username2);
		followers.add(username3);
		System.out.println("Followers: " + followers);

		// LinkedHashSet - Unique items, insertion order
		LinkedHashSet<String> linkedFollowers = new LinkedHashSet<>();

		// Add followers
		linkedFollowers.add(username1);
		linkedFollowers.add(username2);
		linkedFollowers.add(username3);
		System.out.println("\nFollowers of LinkedHashSet: " + linkedFollowers);
//
		// TreeSet - Unique items, sorted by some comparator
		TreeSet<String> treeFollowers = new TreeSet<>();

		// Add followers
		treeFollowers.add(username1);
		treeFollowers.add(username2);
		treeFollowers.add(username3);
		System.out.println("\nFollowers of TreeSet: " + treeFollowers);
//
//		// We can use the iterator to print out the followers one by one
		Iterator<String> hashIterator = followers.iterator();
		while (hashIterator.hasNext()) {
			System.out.println(hashIterator.next() + ", ");
		}

		// Adding username3 again
		System.out.println("\nAdded " + username3 + ": " + followers.add(username3));
		// case sensitive
		System.out.println("\nAdded " + username3.toLowerCase() + ": " + followers.add(username3.toLowerCase()));
		System.out.println("Followers: " + followers);

//		// Remove Followers
		System.out.println("\nRemoving " + username3.toLowerCase() + ": " + followers.remove(username3.toLowerCase()));
		System.out.println("Followers: " + followers);

//		// size of followers
		System.out.println("\nHow many followers do I have: " + followers.size());

//		// Check if set contains a username
		System.out.println("\nDoes JustinBeibs follow me? " + followers.contains("JustinBeibs"));

//		// headSet() shows elements before parameter (exclusive), tailSet() shows
//		// elements after (inclusive)
		System.out.println("\nFollowers of TreeSet Head: " + treeFollowers.headSet(username1));
		System.out.println("Followers of TreeSet Tail: " + treeFollowers.tailSet(username1));

	}

}
