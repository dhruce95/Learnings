package Sorting;

//3,6,1,5,9
//p: 3
//l: 3|1|6|3
//r: 9|5|1|3|6|3
//
//3>9 false r-- 3,6,1,5,9
//3>5 false r-- 3,6,1,5,9
//3>1 true swap(3,1) 1,6,3,5,9
//3<1 false l++ 1,6,3,5,9
//3<6 true swap(3,6) 1,3,6,5,9
//3>6 false r-- 1,3,6,5,9
public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr = {3,6,1,5,9};
		sort(arr,0,arr.length-1);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	static void sort(int[] arr, int left, int right) {
		if(left<right){
			int pivotIndex = partition(arr, left, right);
			sort(arr, left, pivotIndex-1);
			sort(arr, pivotIndex+1, right);			
		}
	}
	
	//9,6,1,5,3
	//pI: 0|-1
	//pV: 9|3
	//l: 3|9|9
	//r: 9|3|3
	//i: -1|-1
	//j: 0|0

	//3,6,1,5,9
	//9,6,1,5,3
	
	static int partition(int[] arr, int left, int right) {
		int pivotValue=arr[right];
		int i=left-1;
		int temp;
		for(int j=left; j<right; j++) {
			if(arr[j]<pivotValue) {
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		temp=arr[i+1];
		arr[i+1]=arr[right];
		arr[right]=temp;
		
		return i+1;
	}

}
