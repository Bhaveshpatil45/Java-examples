package com.bhavesh.practice.collections.hashmapExamples;

import java.util.HashMap;
import java.util.Set;

public class Exercise9_mappingsContained {
    public static void main(String[] args) {
        HashMap<Integer,String> list_string = new HashMap<Integer, String>();
        list_string.put(1,"Indore");
        list_string.put(2,"Mumbai");
        list_string.put(3,"Delhi");
        list_string.put(4,"Noida");
        list_string.put(5,"Kolkata");
        Set set = list_string.entrySet();
        System.out.println("Set values: " + set);
    }
}
