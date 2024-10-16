package com.bhavesh.practice.collections.hashsetExamples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise8_convertToTreeset {
    public static void main(String[] args) {
        HashSet<String> list_string = new HashSet<String>();
        list_string.add("Red");
        list_string.add("Green");
        list_string.add("Yellow");
        list_string.add("White");
        System.out.println("Original Hashset: " + list_string);

        Set<String> tree_set = new TreeSet<String>(list_string);

        System.out.println("Treeset Elements: ");
        for (String element : tree_set){
            System.out.println(element);
        }
    }
}
