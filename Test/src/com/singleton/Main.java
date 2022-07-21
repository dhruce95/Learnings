package com.singleton;

public class Main {
	
	public static void main(String[] args) {
		Sample s1 = Sample.getInstance();
		Sample s2 = Sample.getInstance();
		System.out.println(s1 == s2);
	}

}
