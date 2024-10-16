package com.bhavesh.practice.collections.hashmapExamples;

import java.util.HashMap;

public class Exercise12_ValuesContained {
    public static void main(String[] args) {
        HashMap<Integer,String> list_string = new HashMap<Integer, String>();
        list_string.put(1,"Pune");
        list_string.put(2,"Mumbai");
        list_string.put(3,"Indore");
        list_string.put(4,"Delhi");
        list_string.put(5,"Noida");

        System.out.println("Collection view is: " + list_string.values());
    }

}
