package com.michael.iskander.problemsolving.amazoninterview;

public class TrickySum {


	//solve Tricky Sum https://codeforces.com/problemset/problem/598/A


	public static void main(String[] args) {

		long n = 1000000000;

		long sumOfSerires = (2 * 1 + n * 1 - 1) * n / 2; // {1,2,3,......,n}

		double limitOfN = Math.pow(10, 9);

		double limitOfPower = Math.log10(limitOfN) / Math.log10(2); // log2(limitOfN)

		int rounded = (int) Math.round(limitOfPower);

		System.out.println(rounded);



		long sumOfPowers = 1;

		long numberOfPower = 1;

		for (int i = 1; i < (rounded+1); i++) {

			long number = numberOfPower * 2;

			if (number > n) {
				break;
			}

			sumOfPowers += number;

			numberOfPower = number;

		}


		long result = sumOfSerires - 2 * (sumOfPowers);

		System.out.println("The result: " + result);

	}

}
