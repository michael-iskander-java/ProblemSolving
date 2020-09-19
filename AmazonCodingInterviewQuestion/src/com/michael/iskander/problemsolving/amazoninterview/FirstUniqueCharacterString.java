package com.michael.iskander.problemsolving.amazoninterview;


public class FirstUniqueCharacterString {


	public static int findFirstUniqueChar(String s) {
		// TODO Auto-generated method stub

		int [] sArray = new int[256];

		for (char c : s.toCharArray()) {

			sArray[c]++;
			System.out.println(c + " ouccurnce " + sArray[c]);
		}

		for (int i= 0;i<s.length();i++) {
			if(sArray[s.charAt(i)] == 1) {

				return i;
			}

		}

		return -1;
	}

public static void main(String[] args) {

	String s = "loveleetcode";

	System.out.println(findFirstUniqueChar(s));

}
}
