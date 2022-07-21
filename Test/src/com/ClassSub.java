package com;

public class ClassSub extends ClassSuper{
	
	public void methodtest(){
		System.out.println("test Sub class");
	}
	
	public static void main(String[] args) {
		String e1 = "ABC";
		String e2 = "ABC";
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		String e3 = e1;
		System.out.println(e3==e1);
		System.out.println(e3==e2);
		System.out.println(e3.equals(e2));
		e1 = "XYZ";
		System.out.println("++++");
		System.out.println(e3.equals(e1));
		System.out.println(e3==e1);
		System.out.println(e3.equals(e2));
		System.out.println(e3==e2);
	}
}
