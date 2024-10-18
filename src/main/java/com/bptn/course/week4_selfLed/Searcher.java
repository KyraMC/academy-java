package com.bptn.course.week4_selfLed;

public class Searcher {
	private int[] arr = { 1, 3, 5, 8, 9 };

	public int mystery(int low, int high, int num) {
		int mid = (low + high) / 2;
		if (low > high) {
			return -1;
		} else if (arr[mid] < num) {
			return mystery(mid + 1, high, num);
		} else if (arr[mid] > num) {
			return mystery(low, mid - 1, num);
		} else
			return mid;
	}

}
