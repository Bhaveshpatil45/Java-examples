package com.bhavesh.practice.collections.hashmapExamples;

import java.util.HashMap;

public class Exercise6_shallowCopy {
    public static void main(String[] args) {
        HashMap<Integer,String> list_string = new HashMap<Integer, String>();
        list_string.put(1,"Pune");
        list_string.put(2,"Indore");
        list_string.put(3,"Delhi");
        list_string.put(4,"Mumbai");
        list_string.put(5,"Kolkata");
        System.out.println("Original Map: " + list_string);
        HashMap<Integer,String> list_string2 = new HashMap<Integer, String>();
        list_string2 = (HashMap)list_string.clone();
        System.out.println("Cloned Map: " + list_string2);

    }
}
