package com.bridgelabz;

public class SmallestElement {

	public static void main(String[] args) {

		int[] array = new int[] { 30, 60, 20, 80, 50 };

		int min = array[0];
		for (int i = 0; i < array.length; i++) {

			if (array[i] < min)
				min = array[i];
		}
		System.out.println("Smallest element of the array: " + min);
	}
}