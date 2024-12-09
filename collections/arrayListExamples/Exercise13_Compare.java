package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;

public class Exercise13_Compare {
    public static void main(String[] args) {
        //Creating ArrayList list1 And adding elements
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        //Creating ArrayList list2 and adding elements
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(15);
        list2.add(30);
        list2.add(45);
        list2.add(60);

        //Storing the Comparison output in ArrayList result
        ArrayList<String> result = new ArrayList<>();
        for (Integer num : list1){
            result.add(list2.contains(num) ? "yes" : "No");
        }

        //Printing the result ArrayList
        System.out.println("Comparison Result : ");
        System.out.println(result);
    }
}
