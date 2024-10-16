package com.bhavesh.practice.collections.hashsetExamples;

import java.util.HashSet;

public class Exercise6_Clone {
    public static void main(String[] args) {
        HashSet<String> list_string = new HashSet<String>();
        list_string.add("Pune");
        list_string.add("Mumbai");
        list_string.add("Indore");
        list_string.add("Kolkata");
        list_string.add("Odisha");
        System.out.println("Original Hashset: " + list_string);
        HashSet<String> new_list = new HashSet<String>();
        new_list = (HashSet)list_string.clone();
        System.out.println("Cloned Hashset: " + new_list);

    }
}
