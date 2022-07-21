package General;

public class StaticClass {
	static String s = "hello world";
	String s2 = "inaccessible";
	static class Inner{
		public void show() {
			System.out.println(s);
//			System.out.println(s2);
		}
	}
	public static void main(String[] args) {
		Inner in = new Inner();
		in.show();
	}
}
