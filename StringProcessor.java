package com.MethodCodingExercises;
// Exercise to implement console program which will meet the following requirements:

//  1.	Program contains two methods that can process input string according to requirements below
//  2.	You have input string like this:
//			Format:
//				Login;Name;Email
//			Example:
//				peterson;Chris Peterson;peterson@outlook.com
//				james;Derek James;james@gmail.com
// A.	First Method
//			public static String convert1 (String input) {
//				<write your code here>
//			}
//		Formats like:
//			peterson ==> peterson@outlook.com
//			james ==> james@gmail.com
//	A.	Second Method
//			public static String convert2 (String input) {
//				<write your code here>
//			}
//		Formats like:
//			Chris Peterson (email: peterson@outlook.com)
//			Derek James (email: james@gmail.com)

public class StringProcessor {
	public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator()
			+ "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator()
			+ "james;Derek James;james@gmail.com" + System.lineSeparator() + "jackson;Walter Jackson;jackson@gmail.com"
			+ System.lineSeparator() + "gregory;Mike Gregory;gregory@yahoo.com";

	public static void main(String[] args) {
		System.out.println("===== Convert 1 demo =====");
		System.out.println(convert1(INPUT_DATA));

		System.out.println("===== Convert 2 demo =====");
		System.out.println(convert2(INPUT_DATA));

	}

	public static String convert1(String input) {
		String lines[] = input.split("\\r?\\n");
		String output = "";
//		peterson ==> peterson@outlook.com
//		james ==> james@gmail.com	
		for (int i = 1; i < lines.length; i++) {
			output += lines[i].split(";")[0] + " ==> " 
					+ lines[i].split(";")[2] + System.lineSeparator();
		}
		return output;
	}

	public static String convert2(String input) {
		String lines[] = input.split("\\r?\\n");
		String output = "";
//		Chris Peterson (email: peterson@outlook.com)
//		Derek James (email: james@gmail.com)
		for (int i = 1; i < lines.length; i++) {
			output += lines[i].split(";")[1] + " (email: " 
					+ lines[i].split(";")[2] + ")" + System.lineSeparator();
		}
		return output;
	}

}