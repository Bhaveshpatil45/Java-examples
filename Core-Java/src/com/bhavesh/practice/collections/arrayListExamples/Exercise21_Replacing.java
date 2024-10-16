package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;

public class Exercise21_Replacing {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<String>();

        city.add("Pune");
        city.add("mumbai");

        System.out.println("Original array list: " + city);
        String new_city = "Delhi";
        city.set(1,new_city);

        int num = city.size();
        System.out.println("Replace second element with 'Delhi'.");
        for (int i=0; i < num; i++)
            System.out.println(city.get(i));
    }
}
