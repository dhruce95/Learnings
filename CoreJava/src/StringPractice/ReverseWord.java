package StringPractice;

//input: Dhruv
//Output: vurhD
public class ReverseWord {
	public static void main(String[] args) {
		
		char c='G';
		System.out.println(c);
		String s=String.valueOf(c);
		System.out.println(s);
		
		String str="My name is dhruv";
		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=ch.length-1;i>=0;i--) {
			sb.append(ch[i]);
		}
//		for(int i=0;i<ch.length;i++) {
//			sb.append(ch[i]);
//		}
		System.out.println(sb.toString());
	}

}
