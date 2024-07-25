package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class Exercise12_Extract {
    public static void main(String[] args) {

        List<String> list_string = new ArrayList<String>();
        list_string.add("Asus");
        list_string.add("Hp");
        list_string.add("Dell");
        list_string.add("MSI");
        list_string.add("Macbook");
        list_string.add("Acer");
        System.out.println("Original List : " + list_string);
        List<String> sub_list = list_string.subList(0, 3);
        System.out.println("List of first Three Elements : " + sub_list);


    }
}
