package com.bridgelabz;

public class ReverseArray {

	public static void main(String[] args) {

		System.out.println("Array in order: ");
		int[] array = new int[] { 30, 60, 20, 80, 50 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Array in reverse order: ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}