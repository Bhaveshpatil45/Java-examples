package com.bhavesh.practice.ifelse;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        System.out.println("-------------finding greatest number-------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Value : ");
        int x = scan.nextInt();
        System.out.println("Enter Second Value : ");
        int y = scan.nextInt();

        if(x > y){
            System.out.println("It is Greatest Number : " + x);
        }
        else{
            System.out.println("It is Greatest number : " + y);
        }
    }
}
