package com.bhavesh.practice.ifelse;

import java.util.Scanner;

public class SquareOrNot {
    public static void main(String[] args) {
        System.out.println("finding which one is square or rectangle");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length : ");
        int length = scan.nextInt();
        System.out.println("Enter breadth");
        int breadth = scan.nextInt();
        System.out.println("--------------------------------------");

        if(length == breadth){         // (length != breadth) = It is rectangle
            System.out.println("it is a square");
        }
        else{
            System.out.println("it is rectangle");
        }
    }
}
