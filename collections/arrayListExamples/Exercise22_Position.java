package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;

public class Exercise22_Position {
    public static void main(String[] args) {
        ArrayList<String> list_string = new ArrayList<String>();
        list_string.add("Pune");
        list_string.add("Mumbai");
        list_string.add("Nashik");
        list_string.add("Indore");
        list_string.add("Delhi");
        System.out.println("\nOriginal array list: " + list_string);
        System.out.println("\nPrint using index of an element: ");
        int no_of_elements = list_string.size();
        for (int index = 0; index < no_of_elements; index++)
            System.out.println(list_string.get(index));
    }
}
