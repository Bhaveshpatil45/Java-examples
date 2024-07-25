package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {

        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Yellow");
        list_Strings.add("White");
        list_Strings.add("Black");
        list_Strings.add("Orange");

        for (String element : list_Strings){
            System.out.println(element);
        }
    }
}
