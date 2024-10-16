package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;

public class Exercise18_EmptyOrNot {
    public static void main(String[] args) {

        ArrayList<String> list_String = new ArrayList<String>();
        list_String.add("Pune");
        list_String.add("Mumbai");
        list_String.add("Delhi");
        list_String.add("Hyderabad");
        System.out.println("Print list : " + list_String);
        System.out.println("Checking the above array list is empty or not! " +list_String.isEmpty());
        list_String.removeAll(list_String);
        System.out.println("list after remove all elements : " + list_String);
        System.out.println("Checking the above array list is empty or not! "+list_String.isEmpty());
    }
}

