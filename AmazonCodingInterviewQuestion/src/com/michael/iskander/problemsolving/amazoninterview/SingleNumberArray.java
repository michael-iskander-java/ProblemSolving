package com.michael.iskander.problemsolving.amazoninterview;

public class SingleNumberArray {

	public static int singleNumber(int[] nums) {

		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {

			result = result ^ nums[i];
		}
		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 7, 3, 5, 4, 5, 3, 4 };

		System.out.println(singleNumber(nums));
	}
}
