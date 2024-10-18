package com.bptn.course.week4_instuctorLed;

import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int array[]) {
		int size = array.length;

		// loop for array element
		for (int i = 0; i < size; i++) {
			// loop for comparison
			for (int j = 0; j < size - 1; j++) {
				// comparison
				// if value on right is less than value on left, we swap
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {
		int[] data = { 5, 3, -1, 7, 10, 2 };
		System.out.println(Arrays.toString(data));
		bubbleSort(data);
		System.out.println(Arrays.toString(data));

	}

}
