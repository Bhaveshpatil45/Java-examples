package com.array;

import java.util.Scanner;

public class MetroTicketSystem {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String destinations[] = {"Manapa", "Swargate", "Hinjewadi", "VimanNagar"};
        int prices[] = {15, 20, 17, 40};

        int destinationIndex;

        while (true){
            System.out.println("Enter destination (0 for Manapa, 1 for swargate, 2 for Hinjewadi, 3 for VimanNagar):");
            destinationIndex = scan.nextInt();

            if (destinationIndex >= 0 && destinationIndex < destinations.length){
                break;
            }
            else{
                System.out.println("Invalid destination. Please enter a Valid destination.");
            }

        }
        int price = prices[destinationIndex];
        System.out.println("Metro Ticket : ");
        System.out.println("Destination: " + destinations[destinationIndex]);
        System.out.println("Price : Rs" + price);
    }
}
