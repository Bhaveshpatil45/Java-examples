package com.bhavesh.operators;

import java.util.Scanner;

public class RelationalEqualityOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        if(num1 != num2){
            System.out.println("num1 is not equal to num2");
        }
        else{
            System.out.println("num1 is exact equal to num2");
        }


        /*
        if(num1 == num2){
            System.out.println("num1 is exact equal to num2");
        }
        else{
            System.out.println("num1 is not equal to num2");
        }

         */

    }
}
