package com.bhavesh.operators;

import java.util.Scanner;

public class IncrementOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a value : ");
        int num = 1;
        int range = scan.nextInt();
        System.out.println("---------------Increment output---------------");

        while(num <= range){
            System.out.println(num);
            num++;                             //increment operator
        }

    }
}
