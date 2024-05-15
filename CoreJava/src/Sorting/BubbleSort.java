package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,8,1,6,9,2};
        print(arr);
        System.out.println();
        sort(arr);
    }

    private static void sort(int[] arr) {
        int temp;
        for (int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            print(arr);
            System.out.println();
        }
    }

    static void print (int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
