package com.bhavesh.operators;

import java.util.Scanner;

public class GreaterThanOrEqualToOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a value under 100: ");
        int range = scan.nextInt();
        int num = 100;

        while(num >= range){
            System.out.println(num);
            num--;                         //decrement operator
        }
    }
}
