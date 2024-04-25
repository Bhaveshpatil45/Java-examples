package com.bhavesh.operators;

import java.util.Scanner;

public class LessThanOrEqualToOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a value : ");
        int num = 1;
        int range = scan.nextInt();

        while(num <= range){
            System.out.println(num);
            num++;                             //increment operator
        }

    }
}
