package com.bhavesh.practice.collections.hashmapExamples;

import java.util.HashMap;

public class Exercise5_EmptyOrNot {
    public static void main(String[] args) {
        HashMap<Integer,String> list_string = new HashMap<Integer, String>();
        list_string.put(1,"Pune");
        list_string.put(2,"Mumbai");
        list_string.put(3,"Indore");
        list_string.put(4,"Delhi");
        boolean result = list_string.isEmpty();
        System.out.println("Is hash map empty: " + result);
        list_string.clear();
        result = list_string.isEmpty();
        System.out.println("Is hash map empty: " + result);
    }
}
