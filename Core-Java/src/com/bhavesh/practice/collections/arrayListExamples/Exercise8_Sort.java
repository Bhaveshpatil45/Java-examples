package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise8_Sort {
    public static void main(String[] args) {

        List<String> list_string = new ArrayList<String>();
        list_string.add("Red");
        list_string.add("Orange");
        list_string.add("Black");
        list_string.add("Green");
        list_string.add("Yellow");
        list_string.add("White");
        System.out.println("List before Sort : " + list_string);
        Collections.sort(list_string);
        System.out.println("List after Sort : " + list_string);
    }
}
