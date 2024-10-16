package com.bhavesh.practice.collections.hashsetExamples;

import java.util.HashSet;

public class Exercise4_RemoveAll {
    public static void main(String[] args) {
        HashSet<String> list_string = new HashSet<String>();
        list_string.add("Mumbai");
        list_string.add("Pune");
        list_string.add("Indore");
        list_string.add("Nashik");
        list_string.add("Delhi");

        System.out.println("Original Hashset: " + list_string);
        list_string.removeAll(list_string);
        System.out.println("Hashset after removing all elements: " + list_string);
    }
}
