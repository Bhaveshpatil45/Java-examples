package com.bhavesh.operators;

import java.util.Scanner;

public class ConditionalOrOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a positive number:");
        int num1 = scan.nextInt();
        
        if((100 > num1) || (num1 % 2 == 0)){
            System.out.println("great number");
        }
        if((100 < num1) || (num1 % 2 != 0)){
            System.out.println("super number");
        }
    }
}
