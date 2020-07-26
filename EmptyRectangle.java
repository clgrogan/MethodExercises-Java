package com.MethodCodingExercises;

import java.util.Scanner;

public class EmptyRectangle {
//	Draw empty rectangle
//	  Implement console program which will meet the following requirements:
//		1.	Program starts and asks user to input height of the rectangle
//		2.	After user inputs heights of the rectangle, 
//			program asks to input width of the rectangle.
//		3.	Program calls specific method which takes two parameters 
//			of int type which prints rectangle to the console:
//	 ******
//	 *    *
//	 ******
//	In the example above height of the rectangle is 3, the width of the rectangle is 6
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();

		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {
		if (height > 0 && width > 0) {
			System.out.print("\n" + "*".repeat(width));
			if (height > 2) {
				System.out.print(("\n*" + " ".repeat(width - 2) + "*").repeat(height - 2));
			}
			if (height > 1) {
				System.out.println("\n" + "*".repeat(width));
			}
		}
	}

}
