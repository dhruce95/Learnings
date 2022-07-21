package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SampleTest {
//	Write a java code to reverse a String in Java.
//	String input = "dlroW olleH";
	//output = "Hello World"
	
	
//	Write a Java program to check if a string or phrase is a palindrome; 
//	String result = "Was it a cat I saw";
	//				was I tac a ti saW
	
	
//	Use Stream API to find the duplicate integers from the ArrayList.
//	Identify the duplicate and store in another collection. So resulting collection will have 20, 40 and 80
//	ArrayList<Integer> numbers = new ArrayList<Integer>( Arrays.asList(10, 20, 20, 25, 30, 40, 40, 40, 67, 80, 80, 80 ));
	
	public static void main(String[] args) {
		String input = "dlroW olleH";
		String input2 = "Was it a cat I saw";
		System.out.println("Is String Palindrome? " + 
				isStringPalindrome(input2.replaceAll(" ", ""), reverseString(input2.replaceAll(" ", ""))));
		
		ArrayList<Integer> numbers = new ArrayList<Integer>( Arrays.asList(10, 20, 20, 25, 30, 40, 40, 40, 67, 80, 80, 80 ));
		HashSet<Integer> set = new HashSet<>();
		
		Set<Integer> output = numbers.stream().filter(x->(!set.add(x))).collect(Collectors.toSet());
		output.forEach(System.out::println);
		
	}
	
	public static String reverseString(String input) {
		char ch[] = input.toCharArray();
		String output = "";
		for(int i=ch.length-1; i>=0; i--) {
			output += ch[i];
		}
		return output;
	}
	
	public static boolean isStringPalindrome(String s1, String s2) {
		return s1.equalsIgnoreCase(s2);
	}
}
