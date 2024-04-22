package com.bhavesh.operators;

import java.util.Scanner;

public class InstanceofOperator {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String city = scan.nextLine();
        System.out.println("Enter Length : ");
        Integer length = scan.nextInt();
        System.out.println("Enter temperature : ");
        Double temperature = scan.nextDouble();
        */
        String city = "Pune";
        Integer length = 23;
        Double temperature = 37.4;

        if(city instanceof String){
            System.out.println("type of city is string");
        }
        else{
            System.out.println("type of city is not string");
        }
        if(length instanceof Integer){
            System.out.println("type of length is integer");
        }
        else{
            System.out.println("type of length is not integer");
        }
        if(temperature instanceof Double){
            System.out.println("type of temperature is double");
        }
        else{
            System.out.println("type of temperature is not Double");
        }
    }
}
