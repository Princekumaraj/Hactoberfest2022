package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,3,4,2,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct] && arr[i] < arr.length)
                swap(arr,i,correct);
            else
                i++;
        }
    }

    static void swap(int[] arr,int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
