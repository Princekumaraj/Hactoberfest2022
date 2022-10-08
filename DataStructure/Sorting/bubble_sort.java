package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,2,3,4,5,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void bubble(int[] arr) {
        // loop steps for n-1 times
         boolean swapped;
         for (int i = 0; i < arr.length - 1; i++) {
             swapped = false;
             for (int j = 1; j < arr.length - i; j++)
                 {
                     if ( arr[j] < arr[j-1])
                     {///swap values
                         int temp = arr[j-1];
                         arr[j-1] = arr[j];
                         arr[j] = temp;
                         swapped = true;
                     }
                 }
             // check for all ready sorted array
             if (!(swapped)) {
                 break;
             }
             }

         }
    }

