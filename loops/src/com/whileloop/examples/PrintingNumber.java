package com.whileloop.examples;

import java.util.Scanner;

public class PrintingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter the range");
        int range = scan.nextInt();
        incrementOperatorPrints(range);
        decrementOperatorPrints(range);
    }

    public static void incrementOperatorPrints(int range) {
        System.out.println("-----------incrementOperator Output-----------");
        int num = 1;
        while (num <= range) {
            System.out.println(num);
            num++;
        }
        System.out.println("-----------incrementOperator Output end here-----------");
    }
    public static void decrementOperatorPrints(int range) {
        System.out.println("-----------decrementOperator Output-----------");
        while (range >= 1) {
            System.out.println(range);
            range--;
        }
        System.out.println("-----------decrementOperator Output end here-----------");
    }
}

