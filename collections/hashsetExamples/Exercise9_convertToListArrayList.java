package com.bhavesh.practice.collections.hashsetExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercise9_convertToListArrayList {
    public static void main(String[] args) {
        HashSet<String> list_string = new HashSet<String>();
        list_string.add("Bike");
        list_string.add("Car");
        list_string.add("Truck");
        list_string.add("Bus");
        System.out.println("Original HashSet: " + list_string);
        List<String> list = new ArrayList<String>(list_string);
        System.out.println("ArrayList contains: " + list);
    }
}
