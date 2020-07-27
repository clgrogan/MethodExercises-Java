package com.MethodCodingExercises;
import java.util.Scanner;
//Exercise to implement console program which will meet the following requirements:
// 1.	Program starts and asks user to enter number
// 2.	Program calls method which takes int as an argument and returns sum of all digits in this number.
//			Method should look like this:
//			public static int sumDigitslnPositiveNumber(int number) {
//				<write your code here>
//			}
// 3.	Program prints sum of all digits to console

public class SumDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();

		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
		String strNumber = Integer.toString(number);
		String[] strDigits = strNumber.split("");
		int sumOfDigits = 0;
//		System.out.println(Arrays.toString(strDigits));
		for (String digit : strDigits) {
			if ("0123456789".contains(digit)) {
				sumOfDigits += Integer.parseInt(digit);
			}
		}
		return sumOfDigits;
	}
}
