package com.MethodCodingExercises;

import java.util.Scanner;

public class WordCount {
//	Calculate Amount of Words
//
//	Exercise to implement a console program which will meet the following requirements:
//	1. 	Program starts and asks user to enter text.
//	2.	Program calls specific function which take one parameter of 
//		String type and returns amount of words in the text.
//	Method should look like this:
//		public static int getWordsAmount(String text) {
//			< write your code here>
//		}
//	3.	Program prints amount of words to the console.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		System.out.println("Number of words in your text: " + getWordCount(sc.nextLine()));
	}

	public static int getWordCount(String inputText) {
		return inputText.split(" ").length;
	}

}
