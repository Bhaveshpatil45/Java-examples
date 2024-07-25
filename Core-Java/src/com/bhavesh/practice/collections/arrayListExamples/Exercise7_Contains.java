package com.bhavesh.practice.collections.arrayListExamples;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise7_Contains {
    public static void main(String[] args) {
        List<String> list_string = new ArrayList<String>();
        list_string.add("Red");
        list_string.add("Green");
        list_string.add("Orange");
        list_string.add("White");
        list_string.add("Pink");
        list_string.add("Black");

        //Searching the value Orange
        if (list_string.contains("Orange")){
            System.out.println("Found the element");
        }
        else{
            System.out.println("There is no such element");
        }

        // Searching the value "Blue"
        if (list_string.contains("Blue")){
            System.out.println("Found the element");
        }
        else {
            System.out.println("There is no such element");
        }
    }
}
