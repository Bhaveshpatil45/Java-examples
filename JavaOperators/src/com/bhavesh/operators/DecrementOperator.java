package com.bhavesh.operators;

import java.util.Scanner;

public class DecrementOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a value : ");
        int range = scan.nextInt();
        System.out.println("---------------decrement output---------------");

        while(range >= 1){
            System.out.println(range);
            range--;
        }
    }
}
