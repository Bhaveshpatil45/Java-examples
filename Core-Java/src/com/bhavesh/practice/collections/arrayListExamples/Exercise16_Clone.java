package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;


public class Exercise16_Clone {
    public static void main(String[] args) {

        ArrayList<String> list_string = new ArrayList<>();
        list_string.add("Bus");
        list_string.add("Car");
        list_string.add("Bicycle");
        list_string.add("Bike");
        list_string.add("Tractor");
        System.out.println("Original List :" + list_string);

        ArrayList<String> list_clone = (ArrayList<String>) list_string.clone();
        System.out.println("Cloned array list: " + list_clone);

    }
}
