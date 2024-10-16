package com.bhavesh.practice.collections.hashmapExamples;

import java.util.HashMap;

public class Exercise2_size {
    public static void main(String[] args) {
        HashMap<Integer,String> list_string = new HashMap<Integer, String>();
        list_string.put(1,"Bus");
        list_string.put(2,"Car");
        list_string.put(3,"Bike");
        list_string.put(4,"Truck");
        System.out.println("Size of the hashmap: " + list_string.size());

    }
}
