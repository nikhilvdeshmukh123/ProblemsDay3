package com.bridgelabz;

public class DuplicateElement {

	public static void main(String[] args) {

		int[] array = new int[] { 30, 60, 20, 80, 50, 60, 90, 80 };

		System.out.println("Duplicate elements in the Array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					System.out.println(array[j]);
			}
		}
	}
}