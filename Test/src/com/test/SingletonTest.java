package com.test;

public class SingletonTest {
	
	static SingletonTest s;
	private SingletonTest() {}
	public SingletonTest getInstance() {
		if(null != s) {
			s = new SingletonTest();
		}
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(7/2);
	}
}
