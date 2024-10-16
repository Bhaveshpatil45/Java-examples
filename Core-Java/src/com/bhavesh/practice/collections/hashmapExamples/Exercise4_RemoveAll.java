package com.bhavesh.practice.collections.hashmapExamples;

import java.util.HashMap;

public class Exercise4_RemoveAll {
    public static void main(String[] args) {
        HashMap<Integer,String> list_string = new HashMap<>();
        list_string.put(1,"Pune");
        list_string.put(2,"Mumbai");
        list_string.put(3,"Nashik");
        list_string.put(4,"Indore");
        System.out.println("Original Hashmap: " + list_string);
        list_string.clear();
        System.out.println("The new map: " + list_string);
    }
}
