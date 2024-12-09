package com.bhavesh.practice.collections.hashsetExamples;

import java.util.HashSet;
import java.util.Iterator;

public class Exercise2_Iterate {
    public static void main(String[] args) {
        HashSet<String> list_String = new HashSet<String>();

        list_String.add("Pune");
        list_String.add("Mumbai");
        list_String.add("Delhi");
        list_String.add("Indore");
        list_String.add("Nashik");

        Iterator<String> p = list_String.iterator();
        while (p.hasNext()){
            System.out.println(p.next());
        }

    }
}
