package StringPractice;

import java.util.ArrayList;

public class AllCharRotation {
//input:abc
//output: 
//	abc
//	bca
//	cab
	public static void main(String[] args) {
		try {
			
		} catch (NullPointerException| ArithmeticException e) {
			// TODO: handle exception
		} 
		String str="abc";
		char[] ch = str.toCharArray();
		String[] sArr=new String[ch.length];
		for(int i=0;i<ch.length;i++) {
			String s = ""+ch[i];
			int len=i+1;
			while(len!=i) {
				if(len>ch.length-1)
					len=0;
				else{
					s+=ch[len];
					len++;					
				}
			}
			sArr[i]=s;
		}
		for(String s: sArr) {
			System.out.println(s);
		}
	}

}
