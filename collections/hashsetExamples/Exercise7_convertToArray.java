package com.bhavesh.practice.collections.hashsetExamples;

import java.util.HashSet;

public class Exercise7_convertToArray {
    public static void main(String[] args) {
        HashSet<String> list_String = new HashSet<String>();
        list_String.add("Indore");
        list_String.add("Mumbai");
        list_String.add("Delhi");
        list_String.add("Kolkata");
        list_String.add("Patna");
        System.out.println("Original Hashset: " + list_String);
        String[] new_Array = new String[list_String.size()];
        list_String.toArray(new_Array);

        System.out.println("Array elements: ");
        for (String element : new_Array){
            System.out.println(element);
        }


    }
}
