package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class Exercise15_addAll {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("60");
        list1.add("70");
        list1.add("65");
        list1.add("12");
        System.out.println("First list : " + list1);

        List<String> list2 = new ArrayList<>();
        list2.add("32");
        list2.add("76");
        list2.add("68");
        list2.add("100");
        System.out.println("Second list : " + list2);

        List<String> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        System.out.println("After adding both list1 + list2 : " + list);

    }
}
