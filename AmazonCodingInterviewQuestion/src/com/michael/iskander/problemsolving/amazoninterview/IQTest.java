package com.michael.iskander.problemsolving.amazoninterview;
import java.util.Scanner;
//https://codeforces.com/contest/328/problem/A
public class IQTest {

	public static void main(String[] args) {


		Scanner z=new Scanner(System.in);
		String line = z.nextLine();

		String [] arrayOfNumberString = line.split(" ");




		int[] a = new int[4];


		a[0] = Integer.valueOf(arrayOfNumberString[0]);
		a[1] = Integer.valueOf(arrayOfNumberString[1]);
		a[2] = Integer.valueOf(arrayOfNumberString[2]);
		a[3] = Integer.valueOf(arrayOfNumberString[3]);



		int d = a[1] - a[0];



		double r = (double)a[1]/(double)a[0];

		int i = (int) (a[3]*r);

		if (a[2]-a[1] == d && a[3]-a[2] == d)
			System.out.println(a[3]+d);
		else if ((double)a[2]/(double)a[1] == r && (double)a[3]/(double)a[2] == r && ((int) (a[3]*r)== (a[3]*r)))
			System.out.println((int)(a[3]*r));
		else
			System.out.println(42);
	}

}
