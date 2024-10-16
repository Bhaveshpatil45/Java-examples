package com.bhavesh.practice.collections.hashsetExamples;

import java.util.HashSet;

public class Exercise10_compareTwoHashset {
    public static void main(String[] args) {
        HashSet<String> list_string = new HashSet<String>();
        list_string.add("Car");
        list_string.add("Bike");
        list_string.add("Truck");
        list_string.add("Bus");

        HashSet<String> list_string2 = new HashSet<String>();
        list_string2.add("Car");
        list_string2.add("Bike");
        list_string2.add("xyz");
        list_string2.add("Bus");

        for (String element : list_string) {
            System.out.println(list_string2.contains(element) ? "Yes" : "No");
        }

    }
}
