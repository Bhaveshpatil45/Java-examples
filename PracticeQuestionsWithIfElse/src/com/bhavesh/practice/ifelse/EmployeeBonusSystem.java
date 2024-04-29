package com.bhavesh.practice.ifelse;

import java.util.Scanner;

/*
A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
 */
public class EmployeeBonusSystem {
    public static void main(String[] args) {
        System.out.println("-----------Giving Bonus Of 5%-----------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your salary : ");
        int salary = scan.nextInt();
        System.out.println("Enter years of service : ");
        int years = scan.nextInt();

        if(years >= 5){
            System.out.println("You will get bonus of : " + .05*salary + " Your salary will be : " + (.05*salary+(salary)) );
        }
        else{
            System.out.println("No Bonus");
        }

    }
}
