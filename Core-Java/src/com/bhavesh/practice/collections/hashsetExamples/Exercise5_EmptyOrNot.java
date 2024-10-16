package com.bhavesh.practice.collections.hashsetExamples;

import java.util.HashSet;

public class Exercise5_EmptyOrNot {
    public static void main(String[] args) {
        HashSet<String> list_string = new HashSet<String>();
        list_string.add("Pune");
        list_string.add("Mumbai");
        list_string.add("Delhi");
        list_string.add("Nashik");
        list_string.add("Indore");
        System.out.println("Original Hashset: " + list_string);
        System.out.println("Checking the array list empty or not: " + list_string.isEmpty());
        list_string.removeAll(list_string);
        System.out.println("Hashset After removing all elements of the array: " + list_string);

    }
}
