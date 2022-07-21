package General;

public class CallStackSize {
	public static int count = 0;
	public static void main(String[] args) {
		hello();
	}
	public static void hello() {
		count++;
		System.out.println("Hi!"+count);
		hello();
	}

}
