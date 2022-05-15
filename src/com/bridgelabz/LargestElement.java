package com.bridgelabz;

public class LargestElement {

	public static void main(String[] args) {

		int[] array = new int[] { 30, 60, 20, 80, 50 };

		int max = array[0];
		for (int i = 0; i < array.length; i++) {

			if (array[i] > max)
				max = array[i];
		}
		System.out.println("Largest element of the array: " + max);
	}
}