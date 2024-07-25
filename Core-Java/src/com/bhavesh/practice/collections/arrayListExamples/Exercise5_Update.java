package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class Exercise5_Update {
    public static void main(String[] args) {

        List<String> list_string = new ArrayList<String>();
        list_string.add("Red");
        list_string.add("Orange");
        list_string.add("blue");
        list_string.add("Green");
        list_string.add("White");

        System.out.println(list_string);
        //update/replace the third element with "yellow"
        list_string.set(2,"Yellow");
        // print update list
        System.out.println(list_string);
    }
}
