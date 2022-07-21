package StringPractice;

import java.util.HashSet;

public class FindNonRepeativeChars {
	
	public static void main(String[] args) {
		String str = "asdfghfgdfgfgggertt";
		char ch[] = str.toCharArray();
		HashSet<Character> noRepeatValues = new HashSet<>();
		HashSet<Character> repeatSet = new HashSet<>();
		for(int i=0;i<ch.length;i++){
			if(repeatSet.contains(ch[i])) continue;
			if(noRepeatValues.contains(ch[i])) {
				noRepeatValues.remove(ch[i]);
				repeatSet.add(ch[i]);
			}
			else
				noRepeatValues.add(ch[i]);
		}
		System.out.println(noRepeatValues);
	}

}
