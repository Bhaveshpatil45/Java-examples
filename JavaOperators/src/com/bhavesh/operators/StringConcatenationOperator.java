package com.bhavesh.operators;

import java.util.Scanner;

public class StringConcatenationOperator {
    public static void main(String[] args) {
        System.out.println("adding strings");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first string :");
        String a = scan.nextLine();
        System.out.println("Enter a second string :");
        String b = scan.nextLine();
        String c = a + b;

        System.out.println("addition of a + b is:" + c);
    }
}
