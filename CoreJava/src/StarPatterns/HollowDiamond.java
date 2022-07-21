package StarPatterns;

public class HollowDiamond {
//	**********--0--i-1
//	****  ****--2--i-2
//	***    ***--4--i-3
//	**      **--6--i-4
//	*        *--8--i-5
//	*        *
//	**      **
//	***    ***
//	****  ****
//	**********
	
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			//top left
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
//			for(int j=i;j>=(2*i)-2;j--) {
//				System.out.print(" ");
//			}
			for(int j=n;j>=n-i+2;j--) {
				System.out.print(" ");
			}
			for(int j=n;j>=n-i+2;j--) {
				System.out.print(" ");
			}
			for(int j=5 ; j>=i ; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n;i>=1;i--) {
			//top left
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			for(int j=n;j>=n-i+2;j--) {
				System.out.print(" ");
			}
			for(int j=n;j>=n-i+2;j--) {
				System.out.print(" ");
			}
			for(int j=5 ; j>=i ; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
