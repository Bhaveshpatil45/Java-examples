package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;

public class Exercise19_Trim {
    public static void main(String[] args) {

        ArrayList<String> list_String = new ArrayList<String>();
        list_String.add("Pune");
        list_String.add("Mumbai");
        list_String.add("Delhi");
        list_String.add("Hyderabad");
        System.out.println("Print list : " + list_String);
        System.out.println("Let trim to size the aboce array: ");
        list_String.trimToSize();
        System.out.println(list_String);
    }
}

