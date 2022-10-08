package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class d2array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];  // declaration + intialization

        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

//        //output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr.length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //another output method
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
//        System.out.println();

        //another one

        for( int[] num: arr){
            System.out.println(Arrays.toString(num));
        }

    }
}
