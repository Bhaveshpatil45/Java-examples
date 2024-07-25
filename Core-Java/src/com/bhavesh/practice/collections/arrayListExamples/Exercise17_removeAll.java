package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;

public class Exercise17_removeAll {
    public static void main(String[] args) {

        ArrayList<String> list_String = new ArrayList<>();
        list_String.add("Pune");
        list_String.add("Mumbai");
        list_String.add("Delhi");
        list_String.add("Hyderabad");
        System.out.println("Print list : " + list_String);
        list_String.removeAll(list_String);
        System.out.println("list after remove all elements : " + list_String);
    }
}
