package com.ashok.string;

import java.util.Arrays;

public class CheckAnagram {
	public static void main(String[] args) {
		boolean value = isAnagram("Ashok", "Ashko");
		System.out.println("Given Strings are " + value);

	}

	private static boolean isAnagram(String a, String b) {

		if (a.length() == b.length()) {
			char[] arr1 = a.toLowerCase().toCharArray();
			char[] arr2 = b.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2))
				return true;
			else
				return false;
		} else
			return false;

	}

}
