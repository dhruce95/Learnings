package zalando;

public class Task1 {
	
	public static void main(String[] args) {
//		System.out.println(solution(new int[]{1,2,5,9,9}, 9));
		System.out.println(solution(new int[]{1,3,6,7,8,9,12,15,25,68}, 9));
	}
	static int solution(int[] A, int X) {
		int N = A.length;
		if(N==0) 
			return -1;
		
		int l=0;
		int r=N-1;
		while (l<r) {
			int m=(l+r)/2;
			if(A[m]>X) {
				r=m-1;
			} else if(A[m]==X) {
				return m;
			} else {
				l=m;
			}
		}
		if(A[l]==X)
			return l;
		
		return -1;
				
	}

}
