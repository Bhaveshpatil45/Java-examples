package com.bhavesh.practice.collections.hashsetExamples;

import java.util.HashSet;

public class Exercise1_Print {
    public static void main(String[] args) {
         HashSet<String> list_string = new HashSet<String>();
        list_string.add("Pune");
        list_string.add("Mumbai");
        list_string.add("Indore");
        list_string.add("Delhi");

        System.out.println("the Hash set: " + list_string);
    }
}
