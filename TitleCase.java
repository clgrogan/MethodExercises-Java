package com.MethodCodingExercises;
import java.util.Scanner;
// Exercise to implement console program which will meet the following requirements:
//	1.	Program starts and asks user to enter text
//	2.	Format the input text so that the first letter of each word is
//		upper-case and the remaining letters are lower case.
//	3.	Program prints result of formatting to console
//		The method should look like:
//			public static String firstCharToTitleCase(String string) {
//				<write your code here>
//			}
public class TitleCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();

		System.out.println(firstCharToTitleCase(userInput));
		System.out.println(firstCharToTitleCaseTest(userInput));
	}

	public static String firstCharToTitleCase(String string) {
		String returnString = "";
		String[] words = string.strip().toLowerCase().split("\\s+");
		for (String word: words) {
			returnString += word.substring(0,1).toUpperCase() + word.substring(1) + " ";
		}
		
		return returnString.stripTrailing();
	}

	public static String firstCharToTitleCaseTest(String string) {
		String returnString = "";
		String[] words = string.toLowerCase().split(" ");
		for (String word: words) {
		    if (word.length() > 0)
			returnString += word.substring(0,1).toUpperCase() + word.substring(1) + " ";
		}
		
		return returnString.stripTrailing();
	}

}
