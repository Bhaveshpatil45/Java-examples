package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise11_Reverse {
    public static void main(String[] args) {

        List<String> list_String = new ArrayList<String>();
        list_String.add("Mercedes");
        list_String.add("Audi");
        list_String.add("Jaguar");
        list_String.add("BMW");
        list_String.add("Porsche");
        System.out.println("Before Reverse : " + list_String);

        Collections.reverse(list_String);
        System.out.println("After Reverse : " + list_String);

    }
}
