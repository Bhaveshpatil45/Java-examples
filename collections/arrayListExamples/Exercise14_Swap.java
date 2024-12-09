package com.bhavesh.practice.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise14_Swap {
    public static void main(String[] args) {

        List<String> list_string = new ArrayList<>();
        list_string.add("Pune");
        list_string.add("Mumbai");
        list_string.add("Delhi");
        list_string.add("Indore");
        list_string.add("Noida");
        list_string.add("Hyderabad");

        System.out.println("Array list before Swap : ");
        for (String a: list_string){
            System.out.println(a);
        }
        //Swapping 1st (index 0 ) element with the 3rd (index 2) element
        Collections.swap(list_string, 0, 2);
        System.out.println("Array list after swap: ");
        for (String b: list_string){
            System.out.println(b);
        }
    }
}
