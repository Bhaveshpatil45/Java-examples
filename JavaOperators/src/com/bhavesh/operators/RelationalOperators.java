package com.bhavesh.operators;
import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first num:");
        int num1 = scan.nextInt();
        System.out.println("Enter second num");
        int num2 = scan.nextInt();

        System.out.println("num1 < num2" + (num1 < num2));
        System.out.println("num1 > num2" + (num1 > num2));
        System.out.println("num1 <= num2" + (num1 <= num2));
        System.out.println("num1 >= num2" + (num1 >= num2));
        System.out.println("num1 !< num2" + (num1 < num2));
        System.out.println("num1 == num2" + (num1 < num2));
    }
}
