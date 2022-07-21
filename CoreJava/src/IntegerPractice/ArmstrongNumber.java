package IntegerPractice;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println(isArmStrong(153));
	}
	
	private static boolean isArmStrong(int num){
		int sum=0;
		  String str = String.valueOf(num);
		  char ch[] = str.toCharArray();
		  
		  for (int i=0; i<ch.length;i++){
		  	sum+= Math.pow(Integer.parseInt(""+ch[i]), ch.length);
		  }
		  
		  if(num==sum)
			return true;
		  
		  return false;
		}
}
