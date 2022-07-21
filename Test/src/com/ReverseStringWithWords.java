package com;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringWithWords {
	//input: My name is Dhruv
	//output: Dhruv is name My
	
	public static void main(String[] args) {
		String str = "Jigar,FeMale,28,Mumbai,9724013533";
		String str2 = "My name is Dhruv";
		reverseString(str2);
	}
	
	static void reverseString(String str) {
		
		for(String s : splitByChar(str, ' ')) {
			System.out.println(s);
		}
		
		String[] splitStr = splitByChar(str, ' ');
		StringBuilder sb = new StringBuilder();
		for(int i=splitStr.length-1;i>=0;i--) {
			sb.append(splitStr[i]).append(" ");
		}
		System.out.println(sb);
	}
	
	static String[] splitByChar(String str, char splitby) {
		List<String> list = new ArrayList<>();
		String st = "";
		for(char c : str.toCharArray()) {
			if(c==splitby) {
				list.add(st);
				st="";
				continue;
			}
			st+=c;
		}
		list.add(st);
		return list.stream().toArray(String[]::new);
//		return list.toArray(new String[] {});
	}

}
