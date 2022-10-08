package com.company;

import java.util.Arrays;
//swap two array elements
public class Swap {
    public static void main(String[] args) {
        int [] arr = {12,45,67,23,1,9};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    static  void swap(int[] arr,int index1,int index2){
        int temp  = arr[index1];
        arr[index1]= arr[index2];
        arr[index2] = temp;
    }
}
