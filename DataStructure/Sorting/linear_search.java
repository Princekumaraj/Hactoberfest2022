package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "Johniscool";
//        System.out.println(Arrays.toString(s1.toCharArray()));
        char target = 'c';
        System.out.println(search(s1,target));
    }

    static boolean search1(String s1,char target){
        if(s1.length()==0)
            return false;
        for(char ch:s1.toCharArray()){
            if(ch==target)
                return true;
        }
        return false;
    }

    static boolean search(String s1,char target){
        if(s1.length()==0)
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if(target == s1.charAt(i))
                return true;
        }
        return false;
    }
}
