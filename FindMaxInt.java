package com.MethodCodingExercises;

import java.util.Arrays;
import java.util.Scanner;
// Exercise: Get user input string. Form the string into an array. 
// Print the array and the max value of the integers in the array.
public class FindMaxInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer numbers separated by a space: ");
		
		String[] values = sc.nextLine().split(" ");
		int[] intArray = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			intArray[i] = Integer.parseInt(values[i]);
		}
		
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(findMaxIntInArray(intArray));
	}
	public static int findMaxIntInArray(int[] intArray) {
			Arrays.sort(intArray);
		return intArray[intArray.length - 1];
	}
}
