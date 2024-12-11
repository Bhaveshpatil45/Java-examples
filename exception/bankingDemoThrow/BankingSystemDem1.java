package exception.bankingDemoThrow;

import exception.bankingDemoTryCatch.BankAccountDem;

import java.util.Scanner;

public class BankingSystemDem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccountDem1 account = new BankAccountDem1(5000.0);

        System.out.println("-----------Welcome to the banking system-----------");
        while (true) {
            System.out.println("\nMenu options:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scan.nextLine());
                if (choice == 1) {
                    System.out.println("Enter amount to deposit: ");
                    double amount = Double.parseDouble(scan.nextLine());
                    account.deposit(amount);
                } else if (choice == 2) {
                    System.out.println("Enter amount to withdraw: ");
                    double amount = Double.parseDouble(scan.nextLine());
                    account.withdraw(amount);
                } else if (choice == 3) {
                    account.checkBalance();
                } else if (choice == 4) {
                    System.out.println("thank you ");
                    break;
                } else {
                    System.out.println("please select a valid option.");
                }
            }catch (NumberFormatException exception) {
                System.err.println("Invalid input. Please enter a valid number.");
            }catch (IllegalArgumentException exception) {
                System.err.println("Error: " + exception.getMessage());
            }
        }
        scan.close();
    }
}