package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(23);
//        list.add(290);
//        list.add(60);
//        list.add(29);
//        list.add(27);

//        System.out.println(list.contains(608));  // checking
//        System.out.println(list);
//
//        list.remove(3);
//        list.set(0,89); // update
//        System.out.println(list);
//
//       
	 //iterate with loop
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //output
        //get items at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here

        }



    }
}
