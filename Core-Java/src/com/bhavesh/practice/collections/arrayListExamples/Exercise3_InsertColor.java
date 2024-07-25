package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class Exercise3_InsertColor {
    public static void main(String[] args) {

        List<String> list_string = new ArrayList<String>();
        list_string.add("Red");
        list_string.add("Orange");
        list_string.add("white");
        list_string.add("blue");
        list_string.add("black");

        System.out.println(list_string);

        list_string.add(0, "Pink");
        list_string.add(5,"Yellow");

        System.out.println(list_string);
    }
}
