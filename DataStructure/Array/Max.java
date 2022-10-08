package com.company;

public class Max {
    public static void main(String[] args) {
        int[] arr = {12,45,67,12,5,79,1,5,6,30};
//        System.out.println(max(arr));
        System.out.println(rangmax(arr,2,6));
    }
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    //work on edge cases here like array being null
    static int rangmax(int[] arr, int start, int end){
        if(start > end) {
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int max = arr[start];
        for (int i = start+1; i < end; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
