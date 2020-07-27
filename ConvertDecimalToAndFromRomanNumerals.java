package com.MethodCodingExercises;

import java.util.Scanner;

//Exercise to implement console program which will meet the following requirements:
//
//1.	Program starts and asks user to select more:
//			a. To convert from decimal to Roman number user should enter D2R
//  		b. To convert from Roman number to decimal user should enter R2D
// 2.	In case user entered random text, program asks user again to enter either D2R or R2D
// 3.	In case user entered R2D, program asks user to enter Roman number
// 4.	In case this is invalid Roman number, program asks user to enter Roman number again.
//			Roman Numeral input range I - C.
// 5.	In case this is valid roman number, program converts it to decimal and prints to console.
// 6.	In case user entered D2R, program asks user to enter integer.
// 7.	In case this is negative integer or more than 100 or zero, program asks to enter integer again.
//			Decimal input range 1 - 100.
// 8.	In case this is valid integer, program converts it to Roman number and prints to console.
// 9.	Program works properly with range of numbers from 1 to 100 inclusively and the same range for Roman number
// 10.	You are not allowed to use 'brute force’ and create switch statement with all Roman numbers mapped to integer. Try to come up with algorithm. 
//	Ref: https://en.wikipedia.org/wiki/Roman_numerals
// I.	Must implement methods like:
//			public static String decimal2Roman(int number) {
//				<write your code here>
//			}
//			public static int roman2Decimal(String romanNumber) {
//				<write your code here>
//			}
//			public static boolean isRomanNumberValidfString romanNumber) {
//				<write your code here>
//			}
//			public static boolean isDecimalNumberValidfint decimalNumber) {
//				<write your code here>
//			}
public class ConvertDecimalToAndFromRomanNumerals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		mainLoop: while (true) {
			System.out.print("Please, select mode. If you want to convert Roman "
					+ "numbers to decimal - type 'R2D' and press enter." + System.lineSeparator()
					+ "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

			String mode = sc.next();
			if (mode.equalsIgnoreCase("R2D")) {
				while (true) {
					System.out.print("Please, enter Roman number you want to convert: ");
					String romanNumber = sc.next();
					if (isRomanNumberValid(romanNumber)) {
						System.out.println(roman2Decimal(romanNumber));
						break mainLoop;
					} else {
						System.out.println("You entered invalid Roman number. " + "Please, try one more time.");
						continue;
					}
				}
			} else if (mode.equalsIgnoreCase("D2R")) {
				while (true) {
					System.out.print("Please, enter decimal number " + "you want to convert: ");
					int decimalNumber = sc.nextInt();
					if (isDecimalNumberValid(decimalNumber)) {
						System.out.println(decimal2Roman(decimalNumber));
						break mainLoop;
					} else {
						System.out.println("Please, enter positive integer from 1 to 100.");
						continue;
					}

				}

			}

			System.out.println("Please, enter 'R2D' or 'D2R.");
		}
	}

	/**
	 * Converts decimal numbers to Roman. Takes int value as a parameter. Works only
	 * with numbers from 1 to 100.
	 * 
	 * @param number to convert to Roman.
	 * @return string of Roman number.
	 */
	public static String decimal2Roman(int number) {
		String romanNumber = "";
		String[] hundred = { "", "C" };
		String[] ten = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String[] one = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		romanNumber += hundred[(number / 100) % 10];
		romanNumber += ten[(number / 10) % 10];
		romanNumber += one[number % 10];

		return romanNumber;
	}

	/**
	 * Converts Roman numbers to decimal.
	 * 
	 * Takes string value with Roman number as a parameter.
	 * 
	 * At first method validates if input string could be Roman number. After method
	 * uses algorithm to convert Roman numeral to decimal.
	 * 
	 * @param romanNumber
	 * @return decimal representation of Roman number
	 */

	public static int roman2Decimal(String romanNumber) {
		int decimalNumber = 0;
		for (int i = 0; i < romanNumber.length(); i++) {
			//Get char value
			int v1 = value(romanNumber.charAt(i));
			//Compare current char value to next char value if there is another char
			//    otherwise add the current value to the return value.
			if (i + 1 < romanNumber.length()) {
				int v2 = value(romanNumber.charAt(i+1));
				System.out.println("\tv1: " + v1 + "\n\tv2: " + v2);
				if (v1 >= v2) {
					decimalNumber += v1;
				} else {
					decimalNumber += (v2 - v1);
					i++;
				}
			} else {
				decimalNumber += v1;
//				i++;
			}
		}
		return decimalNumber;
	}
	public static int value(char romanChar) {
		switch (romanChar) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		default:
			return 1000;
		}
	}

	/**
	 * Validation for Roman numbers.
	 * 
	 * Use regular expression which is checking if string really could be Roman
	 * number.
	 * 
	 * @param romanNumber
	 * @return true if String is Roman number
	 */
	public static boolean isRomanNumberValid(String romanNumber) {
		return romanNumber.matches("[ILVXC]+");
	}

	public static boolean isDecimalNumberValid(int decimalNumber) {
		return (decimalNumber >= 1 && decimalNumber <= 100) ? true : false;
	}
}
