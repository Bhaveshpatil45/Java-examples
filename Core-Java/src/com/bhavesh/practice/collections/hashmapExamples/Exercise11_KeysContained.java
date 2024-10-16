package com.bhavesh.practice.collections.hashmapExamples;

import java.util.HashMap;
import java.util.Set;

public class Exercise11_KeysContained {
    public static void main(String[] args) {
        HashMap<Integer,String> list_string = new HashMap<Integer, String>();
        list_string.put(1,"Pune");
        list_string.put(2,"Mumbai");
        list_string.put(3,"Indore");
        list_string.put(4,"Delhi");
        list_string.put(5,"Noida");

        Set keyset = list_string.keySet();
        System.out.println("key set values are: " + keyset);
    }
}
