package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class Exercise4_Retrieve {
    public static void main(String[] args) {
        List<String> list_String = new ArrayList<String>();
        list_String.add("Red");
        list_String.add("Blue");
        list_String.add("Green");
        list_String.add("Orange");
        list_String.add("Black");

        System.out.println(list_String);
        // Retrieve the first and third element
        String element = list_String.get(0);
        System.out.println("First element: " + element);
        element = list_String.get(2);
        System.out.println("Third element: " + element);

    }

}
