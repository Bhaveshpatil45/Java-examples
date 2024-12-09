package com.bhavesh.practice.collections.hashsetExamples;

import java.util.HashSet;

public class Exercise11_compareTwoSetAndRetain {
    public static void main(String[] args) {
        HashSet<String> list_string = new HashSet<String>();
        list_string.add("Car");
        list_string.add("Bike");
        list_string.add("Truck");
        list_string.add("Bus");
        System.out.println("First Hashset contains: "+list_string);
        HashSet<String> list_string2 = new HashSet<String>();
        list_string2.add("Car");
        list_string2.add("Bike");
        list_string2.add("xyz");
        list_string2.add("Bus");
        System.out.println("Second Hashset contains: " + list_string2);

        list_string.retainAll(list_string2);
        System.out.println("Hashset contains: ");
        System.out.println(list_string);

    }
}
