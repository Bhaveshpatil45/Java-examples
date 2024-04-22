package com.bhavesh.operators;

public class ArihtmeticsOperatorsnew {

    int a = 20;
    int b = 5;

    void addition(){
        int total = a + b;
        System.out.println("total is:" + total);
    }
    void subtraction(){
        int subtraction = a - b;
        System.out.println("subtraction is:" + subtraction);
    }
    void multiplication(){
        int multi = a * b;
        System.out.println("multiplication is:" + multi);
    }
    void division(){
        int division = a/b;
        System.out.println("division is:" + division);
    }

    public static void main(String[] args) {
        ArihtmeticsOperatorsnew calculator = new ArihtmeticsOperatorsnew();
        calculator.addition();
        calculator.subtraction();
        calculator.multiplication();
        calculator.division();
    }
}
