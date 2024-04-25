package com.bhavesh.operators;

import java.util.Scanner;

public class BitwiseAndOperator {
    static int firstNumber = 0;
    static int secondNumber = 0;

    private static void bitwiseAndOperator(){
        int result = firstNumber & secondNumber;
        System.out.println("bitwise AND result " + result);
    }

    public static void main(String[] args) {
        System.out.println("please enter 2 value");
        Scanner scan = new Scanner(System.in);
        firstNumber = Integer.valueOf(scan.nextLine());
        secondNumber = Integer.valueOf(scan.nextLine());

        bitwiseAndOperator();


    }
}
