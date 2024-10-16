package com.bhavesh.practice.collections.hashmapExamples;

import java.util.HashMap;

public class Exercise3_copy {
    public static void main(String[] args) {
        HashMap<Integer,String> list_string = new HashMap<Integer, String>();
        list_string.put(1,"Pune");
        list_string.put(2,"Nagpure");
        list_string.put(3,"Mumbai");
        System.out.println("First Hashmap: " + list_string);

        HashMap<Integer,String> list_string2 = new HashMap<Integer, String>();
        list_string2.put(4,"Indore");
        list_string2.put(5,"Bhopal");
        list_string2.put(6,"Ujjain");
        System.out.println("Second Hashmap: " + list_string2);

        list_string2.putAll(list_string);
        System.out.println("Now values in Second map: " + list_string2);
    }
}
