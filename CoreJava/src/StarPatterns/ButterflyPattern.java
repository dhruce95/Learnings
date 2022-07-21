package StarPatterns;

public class ButterflyPattern {
//	*      *
//	**    **
//	***  ***
//	********
//	********
//	***  ***
//	**    **
//	*      *
	public static void main(String[] args) {
		int n = 4;
		
		//upper half
		for(int i=1 ; i<=n ; i++) {
			//upper left part
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
			}
			//spaces
			for(int j=1 ; j<=2*(n-i) ; j++){
				System.out.print(" ");
			}
			//upper right part
			for(int j=1 ; j<=i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//lower half
		for(int i=n ; i>=1 ; i--) {
			//lower left part
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
			}
			//spaces
			for(int j=1 ; j<=2*(n-i) ; j++){
				System.out.print(" ");
			}
			//lower right part
			for(int j=1 ; j<=i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
