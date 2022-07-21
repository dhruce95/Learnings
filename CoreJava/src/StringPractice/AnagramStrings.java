package StringPractice;

import java.util.HashMap;
import java.util.Map;

public class AnagramStrings {
	//ACT<=>CAT
	//KEEP<=>PEEK
	public static void main(String[] args) {
		if(isAnagram("CAT", "ACT"))
			System.out.println("Given Strings are Anagram");
		else
			System.out.println("Given Strings are not anagram");
	}
	static boolean isAnagram(String str1, String str2) {
		
		if(str1.length()==str2.length()) {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Map<Character, Integer> m1 = new HashMap<>();
			Map<Character, Integer> m2 = new HashMap<>();
			for(int i=0;i<ch1.length;i++) {
				if(m1.containsKey(ch1[i]))
					m1.put(ch1[i], m1.get(ch1[i])+1);
				else
					m1.put(ch1[i], 1);
				
				if(m2.containsKey(ch2[i]))
					m2.put(ch2[i], m2.get(ch2[i])+1);
				else
					m2.put(ch2[i], 1);
				
			}
//			for(int i=0;i<ch2.length;i++) {
//				
//			}
			for(char c : m1.keySet()) {
				if(m2.get(c).equals(m1.get(c))) m2.remove(c);
			}
			if(m2.isEmpty()) return true;
			else return false;
		}
		
		return false;
	}

}

