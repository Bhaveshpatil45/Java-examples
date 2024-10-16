package com.bhavesh.practice.collections.hashmapExamples;

import java.util.HashMap;
import java.util.Map;

public class Exercise1_Specified {
    public static void main(String[] args) {
        HashMap<Integer,String> list_string = new HashMap<>();
        list_string.put(1, "Pune");
        list_string.put(2, "Mumbai");
        list_string.put(3, "Indore");
        list_string.put(4, "Nashik");
        list_string.put(5, "Delhi");

        for (Map.Entry<Integer, String> x : list_string.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }

    }
}
