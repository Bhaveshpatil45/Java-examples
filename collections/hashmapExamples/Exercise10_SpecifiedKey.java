package com.bhavesh.practice.collections.hashmapExamples;

import java.util.HashMap;

public class Exercise10_SpecifiedKey {
    public static void main(String[] args) {
        HashMap<Integer,String> list_string = new HashMap<Integer, String>();
        list_string.put(1,"Mumbai");
        list_string.put(2,"Pune");
        list_string.put(3,"Noida");
        list_string.put(4,"Delhi");
        list_string.put(5,"Indore");

        String val = (String)list_string.get(3);
        System.out.println("Value for key 3 is: " + val);
    }
}
