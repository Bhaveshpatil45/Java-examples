package com.bhavesh.practice.collections.hashmapExamples;

import java.util.HashMap;

public class Exercise8_containsKey {
    public static void main(String[] args) {
        HashMap<String,Integer> list_string = new HashMap<String, Integer>();
        list_string.put("Pune",1);
        list_string.put("Nashik",2);
        list_string.put("Kolkata",3);
        list_string.put("Indore",4);
        list_string.put("Mumbai",5);
        System.out.println("The Original map: " + list_string);
        System.out.println("1. Is key 'Pune' exists?");

        if (list_string.containsKey("Pune")){
            System.out.println("Yes - " + list_string.get("Pune"));
        }
        else {
            System.out.println("No");
        }

        System.out.println("2. Is key 'Delhi' exists?");
        if (list_string.containsKey("Delhi")){
            System.out.println("Yes - " + list_string.get("Delhi"));
        }
        else {
            System.out.println("No");
        }
    }
}
