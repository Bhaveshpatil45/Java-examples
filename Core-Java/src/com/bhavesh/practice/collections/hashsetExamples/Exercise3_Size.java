package com.bhavesh.practice.collections.hashsetExamples;

import java.util.HashSet;

public class Exercise3_Size {
    public static void main(String[] args) {
        HashSet<String> list_string = new HashSet<String>();

        list_string.add("Pune");
        list_string.add("Mumbai");
        list_string.add("Nashik");
        list_string.add("Indore");
        list_string.add("Delhi");
        list_string.add("Thane");

        System.out.println("Original Hash set: " + list_string);
        System.out.println("Size of hash set: " + list_string.size());

    }
}
