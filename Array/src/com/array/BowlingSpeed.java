package com.array;

import java.util.Scanner;

public class BowlingSpeed {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Storing Bowling Speed : ");
        int bowling[] = new int[6];
        int boll = 0;
        while(boll <= 5){
            System.out.println("Enter boll speed : " + boll);
            bowling[boll] = scan.nextInt();
            boll++;
        }
        boll = 0;
        while(boll <= 5){
            System.out.println("Enter bolls speed are : " + boll+ " : " + bowling[boll] + "kms");
            boll++;
        }



    }
}
