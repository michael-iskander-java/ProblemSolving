package com.michael.iskander.problemsolving.amazoninterview;


public class IQTest {

	public static void main(String[] args) {

		int[] a = new int[4];


		a[0] = 1;
		a[1] = 334;
		a[2] = 667;
		a[3] = 1000;

		int d = a[1] - a[0];

		double r = (double)a[1]/(double)a[0];

		if (a[2]-a[1] == d && a[3]-a[2] == d)
			System.out.println("The result is: " + (a[3]+d));
		else if ((double)a[2]/(double)a[1] == r && (double)a[3]/(double)a[2] == r && (double)a[3]*r==a[3]*r)
			System.out.println("The result is: " + (a[3]*r));
		else
			System.out.println("The result is: " + 42);
	}

}
