package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise9_Copy {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Pune");
        list1.add("Mumbai");
        list1.add("Indore");
        list1.add("Delhi");
        System.out.println("Printing List1 : " + list1);

        List<String> list2 = new ArrayList<String>();
        list2.add("Kolkata");
        list2.add("bengaluru");
        list2.add("hyderabad");
        list2.add("chennai");
        System.out.println("Printing List2 : " + list2);
        //copy list1 to list2
        Collections.copy(list1,list2);
        System.out.println("Copy list to list2, \nAfter copy");
        System.out.println("List : " + list1);
        System.out.println("List : " + list2);
    }
}
