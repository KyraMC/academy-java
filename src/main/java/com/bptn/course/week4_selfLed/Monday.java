package com.bptn.course.week4_selfLed;

public class Monday {

	public static void main(String[] args) {
		int[] elements = { 90, -30, 20 };
		System.out.println(mystery(elements, 50));

		int[] arr = { 2, 10, 23, 31, 55, 86 };
		System.out.println(binarySearch(arr, 2));

		Searcher s = new Searcher();
		System.out.println(s.mystery(0, 4, 3));

//		int[] a = { 1, 2, 3, 4 };
//		int v = 3;
//		System.out.println(test(a, v));
	}

	public static int mystery(int[] elements, int target) {
		for (int j = 0; j < elements.length; j++) {
			if (elements[j] == target) {
				return j;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] elements, int target) {
		int left = 0;
		int right = elements.length - 1;
		while (left <= right) {
			int middle = (left + right) / 2;
			if (target < elements[middle]) {
				right = middle - 1;
			} else if (target > elements[middle]) {
				left = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}

//	public static int test(int[] a, int v) {
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] == v)
//				return i;
//			else
//				return -1;
//		}
//	}
}
