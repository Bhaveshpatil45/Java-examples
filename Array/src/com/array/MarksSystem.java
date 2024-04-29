package com.array;

import java.util.Scanner;

public class MarksSystem {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Pls enter marks of 5 subject : ");
        int subjectMarks[] = new int[5];
        int position = 0;
        while(position <= 4){
            System.out.println("Pls enter marks of  subject : " + position + ": ");
            subjectMarks[position] = scan.nextInt();
            position++;
        }
        System.out.println("marks of student are : ");
        position = 0;
        while(position <= 4){
            System.out.println("Marks for subject - " + position + "=" + subjectMarks[position]);
            position++;
        }

    }
}
