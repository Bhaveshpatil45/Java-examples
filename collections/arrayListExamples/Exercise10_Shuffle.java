package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise10_Shuffle {
    public static void main(String[] args) {

        List<String> list_string = new ArrayList<String>();
        list_string.add("Bike");
        list_string.add("Car");
        list_string.add("Bicycle");
        list_string.add("truck");
        list_string.add("tractor");
        list_string.add("Bus");
        System.out.println("before shuffle: " + list_string);

        Collections.shuffle(list_string);
        System.out.println("After Shuffle : " + list_string);

    }
}
