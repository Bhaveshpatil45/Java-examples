package com.bhavesh.operators;

import java.util.Scanner;

public class ConditionalAndOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int num1 = scan.nextInt();

        if((num1 % 2 == 0) && (num1 > 100)){
            System.out.println("it is a even golden number");
        }
        if((num1 % 2 == 0) && (num1 < 100)){
            System.out.println("it is a even silver number");
        }
        if((num1 % 2 != 0) && (num1 > 100)){
            System.out.println("it is a odd platinium number");
        }
        if((num1 % 2 != 0) && (num1 < 100)){
            System.out.println("it is a odd titanum number");
        }


        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a first number");
        int no1 = scan.nextInt();
        //System.out.println("");

        if(no1 % 2 == 0 ){
            if(no1 > 100){
                System.out.println("it is a even golden number");
            }
            else {
                System.out.println("it is a even silver number");
            }
        }else{
            if(no1 > 100){
                System.out.println("it is a odd platinium number");
            }
            else{
                System.out.println("it is a odd titanium number");
            }
        }
    }


     */

    }
}
