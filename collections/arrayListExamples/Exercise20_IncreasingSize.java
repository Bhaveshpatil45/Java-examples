package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;

public class Exercise20_IncreasingSize {
    public static void main(String[] args) {

        ArrayList<String> list_String = new ArrayList<String>();
        list_String.add("Pune");
        list_String.add("Mumbai");
        list_String.add("Delhi");
        list_String.add("Hyderabad");
        System.out.println("Original array list: "+list_String);
        //increasing capacity to 7
        list_String.ensureCapacity(7);
        list_String.add("indore");
        list_String.add("Ujjain");
        list_String.add("Devas");
        System.out.println("new arraylist : " + list_String);

    }
}
