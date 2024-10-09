package com.bptn.course.challenge_oct_09;

import java.util.Arrays;

public class CodeChallenge { // test

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };

		int target = 9;

		int index1 = 0;
		int index2 = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					index1 = i;
					index2 = j;
				}

			}
		}
		int[] indices = { index1, index2 };

		System.out.println("Input:" + Arrays.toString(nums) + ", Target: " + target);
		System.out.println("Output: " + Arrays.toString(indices));
		System.out.println("Explanation: Because nums[" + index1 + "] + nums[" + index2 + "] == " + target
				+ ", we return " + Arrays.toString(indices));

	}

}
