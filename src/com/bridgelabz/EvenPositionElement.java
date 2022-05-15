package com.bridgelabz;

public class EvenPositionElement {

	public static void main(String[] args) {

		int[] array = new int[] { 30, 60, 20, 80, 50 };
		System.out.println("Element of array at even position: ");

		for (int i = 1; i < array.length; i = i + 2) {
			System.out.println(array[i]);
		}
	}
}