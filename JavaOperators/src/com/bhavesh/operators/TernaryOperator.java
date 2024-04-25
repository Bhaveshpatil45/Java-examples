package com.bhavesh.operators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scan.nextInt();

        //Ternary Operator
        System.out.println((num1 % 2 == 0) ? "It is a even number using ternary operator": "It is odd number using ternary operator" );

        // number is positive or negative....
        System.out.println("enter a number");
        int num2 = scan.nextInt();
        System.out.println((num2 > 0) ? "It is a positive number using ternary operator": "It is negative number using ternary operator" );



    }
}
