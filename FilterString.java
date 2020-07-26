package com.MethodCodingExercises;
import java.util.Scanner;
import java.util.Arrays;

public class FilterString {
//	Filter String array
//	Exercise to implement console program which will meet the following requirements:
//
//	1.	Program starts and asks user to enter random words separated by space
//	2.	Program asks user to enter minimum length of string to filter words which were entered
//	3.	Program creates array object from entered words
//	4.	Program calls specific method which takes String[] as a parameter and returns array of strings which contains words that have
//		length more or equal to value specified by user
//
//	Method should look like this:
//		public static String[] filterWordsByLengthfint minLength, String[] words) {
//			< write your code here>
//		}
//	5.	Program prints filtered array to the console output.

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please, enter any words separated by space: ");
			String userInput = sc.nextLine();
			System.out.print("Please, enter minumum word length to filter words: ");
			int minLength = sc.nextInt();
			
			String[] words = userInput.split("\\s+");
			String[] filteredWords = filterWordsByLength(minLength, words);
			System.out.println(Arrays.toString(filteredWords));
		}

		
		
		public static String[] filterWordsByLength(int minLength, String[] words) {
			String filteredWords = "";
			boolean first = true;
			for (String word:words) {
				if(word.length()  >= minLength) {
					if (!first) { filteredWords += " "; } else {
						first = !first;
					}
					filteredWords += word;
				}
			}
			return filteredWords.split(" ");
		}

	}
