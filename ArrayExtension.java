package com.MethodCodingExercises;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArrayExtension {
//	Exercise to implement console program which will meet the following requirements:
//
//	1.	Program starts and asks user to enter length of an array.
//	2.	Program generates array of random integer numbers (use java.util.Random) with array length specified by user.
//		Method should look like this:
//			public static int[] generateRandomArrayfint amountOfElements) {
//				<write your code here>
//			}
//	3.	Program creates the second array with size of twice as much as the first array.
//	4.	The first elements in the new array are first the same elements as in old array. The other half of elements are elements as in the first array multiplied by two.
//		Method should look like this:
//			public static int[] extendArray(int[] arr) {
//				<write your code here>
//			}
//	For example, if user set initial array length as ten:
//		array #1 - {1, 3, 5, 7,10,11,12,15,17, 20} (generated randomly)
//		array #2 - {1, 3, 5, 7, 10, 11,12, 15, 17, 20, 2, 6, 10, 14, 20, 22, 24, 30, 34, 40}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter length of initial array: ");
		int baseArrayLength = sc.nextInt();
		int[] arr = generateRandomArray(baseArrayLength);
		int[] extendedArray = extendArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(extendedArray));
	}
	public static int[] extendArray(int[] arr) {
		int[] extendedArr = new int[arr.length * 2];
		for ( int i = 0; i < arr.length; i++) {
			extendedArr[i] = arr[i];
			extendedArr[i + arr.length] = arr[i] * 2;
		}
		return extendedArr;
	}

	public static int[] generateRandomArray(int amountOfElements) {
		int[] randArr = new int[amountOfElements];
		Random myRandom = new Random();
		
		for ( int i = 0; i < amountOfElements; i++) {
			randArr[i] = myRandom.nextInt(100) + 1;
		}
		return randArr;
	}
	

}
