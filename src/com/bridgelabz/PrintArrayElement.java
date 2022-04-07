package com.bridgelabz;

import java.util.Arrays;

public class PrintArrayElement {

	public static void main(String[] args) {

		String[] fruits = { "Apple", "Banana", "Chiku", "Kiwi" };
		System.out.println("Printing 1st index Element: " + fruits[1]);

		System.out.println("Printing all elements of array: " + Arrays.toString(fruits));
	}
}