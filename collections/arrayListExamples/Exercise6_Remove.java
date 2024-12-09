package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class Exercise6_Remove {
    public static void main(String[] args) {

        List<String> list_string = new ArrayList<String>();
        list_string.add("Green");
        list_string.add("Red");
        list_string.add("Blue");
        list_string.add("Yellow");
        list_string.add("Orange");
        list_string.add("White");
        list_string.add("Black");
        list_string.add("Pink");
        System.out.println(list_string);

        list_string.remove(2);
        System.out.println(list_string);
        list_string.remove(4);
        System.out.println(list_string);
        list_string.remove(0);
        System.out.println(list_string);
    }
}
