package com.michael.iskander.problemsolving.amazoninterview;

import java.util.Scanner;

public class IQTestTwo {


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

	if (a[2]-a[1] == d && a[3]-a[2] == d)
		System.out.println(a[3]+d);
	else if ((a[0]*a[2]==a[1]*a[1])&&(a[1]*a[3]==a[2]*a[2])&&(a[3]*a[3]%a[2]==0))
		System.out.println(a[3]*a[3]/a[2]);
	else
		System.out.println(42);
}

}
