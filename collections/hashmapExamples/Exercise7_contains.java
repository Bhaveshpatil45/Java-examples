package com.bhavesh.practice.collections.hashmapExamples;

import java.util.HashMap;

public class Exercise7_contains {
    public static void main(String[] args) {
        HashMap<String,Integer> list_string = new HashMap<String,Integer>();
        list_string.put("Pune",1);
        list_string.put("Mumbai",2);
        list_string.put("Indore",3);
        list_string.put("Nashik",4);
        list_string.put("Delhi",5);
        System.out.println("Original Hashmap: " + list_string);
        System.out.println("1. Is key Pune exists? ");

        if (list_string.containsKey("Pune")){
            System.out.println("Yes - " +list_string.get("Pune"));
        }
        else {
            System.out.println("No");
        }

        System.out.println("2. Is Key Noida exists? ");
        if (list_string.containsKey("Noida")){
            System.out.println("Yes - " +list_string.get("Noida"));
        }
        else {
            System.out.println("No");
        }
    }
}
