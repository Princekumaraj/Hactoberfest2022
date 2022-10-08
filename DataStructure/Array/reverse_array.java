package com.company;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr= {12,56,78,23,1,3,6,7,8};

//        System.out.print(Arrays.toString(reverse(arr)));
        reverse(arr);
    }
    static void reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start < end) {
            swap(arr, start, end);  //call swap function
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

     static void swap(int[] arr, int Index1, int Index2) {   //replacig array values
        int temp = arr[Index1];
        arr[Index1] = arr[Index2];
        arr[Index2] = temp;
    }
}
