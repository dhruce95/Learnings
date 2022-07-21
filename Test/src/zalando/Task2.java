package zalando;

public class Task2 {
	public static void main(String[] args) {
		System.out.println(calc(new int[] {1,3,2,1,2,1,5,3,3,4,2}));
		System.out.println(calc(new int[] {5,8}));
		System.out.println(calc(new int[] {1,1,1,1}));
		
	}
	
	public static int brushCount(int[] buildings)
	{
	    int count=0;
	    for(int i=0; i<=buildings.length-1; i++){
	        if((i+1)<(buildings.length)){
	            if(buildings[i]>buildings[i+1]){
	                count += buildings[i]-buildings[i+1];
	            }
	        }else{
	            count += buildings[i];
	        } 
	    }
	    return count;
	}
	
	public static int calc(int[] arr) {
		int lastBuildingHeight = 0;
		int strokes = 0;
		for(int i : arr) {
			if(lastBuildingHeight < i) {
				strokes+=(i-lastBuildingHeight);
			}
			lastBuildingHeight = i;
		}
		return strokes;
	}

}
