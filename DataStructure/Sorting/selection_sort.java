package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,0,0,0,0,1,2,3,4,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find max item with remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMax_Index(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static int getMax_Index(int[] arr, int start, int last) {
        int max = start;
        for (int j = start; j <= last; j++) {
            if (arr[max] < arr[j])
                max = j;
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;
    }

}
