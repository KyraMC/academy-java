package com.bptn.course.week4_instuctorLed;

import java.util.Arrays;

public class Main {

	public void Start() {

		int[] array = { 10, 20, 30, 50, 60, 80, 110, 130, 140, 170 };
		int key = 110;

		Arrays.sort(array);

		// sort array
		int result = binarySearch(array, key);

		// Print values in array after sort
		System.out.println(result);

	}

	int binarySearch(int arr[], int key) {
		// put your code here.
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == key) {
				return mid; // Element found, return its index
			}

			if (arr[mid] < key) {
				left = mid + 1; // key is in the right half
			} else {
				right = mid - 1; // key is in the left half
			}
		}

		return -1; // Element not found in the ArrayList
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.Start();
	}
}
