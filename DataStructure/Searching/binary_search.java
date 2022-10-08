package com.company;

public class easy_one {
    public static void main(String[] args) {
        int[] arr = {12,13,45,50,67,89,90,99,100,120,130,150,160,200};

        int ans = binarysearch(arr,100);
        System.out.println(ans);

    }
    static int binarysearch(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;

        while( start <= end)
        {
           int mid = start + (end - start )/2;

           //check it
           if (target < arr[mid])
               end  = mid-1;
           else if (target > arr[mid])
               start = mid +1;
           else
               return mid;
        }
        return -1;
    }
}
