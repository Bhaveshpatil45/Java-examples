package com.bhavesh.practice.ifelse;

/*
A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
*/

import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Purchase quantity");
        int x = scan.nextInt();
        System.out.println("the total value of purchase is:" + x*100);

        if(x*100 > 1000){
            System.out.println( "you get discount of :" + (.1*x*100) +" you need yo pay " + (x*100-(.1*x*100)));
        }
        else{
            System.out.println("No discount");
        }
        System.out.println("Thank you");
    }
}
