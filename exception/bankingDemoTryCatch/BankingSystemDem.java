package exception.bankingDemoTryCatch;

import java.util.Scanner;

public class BankingSystemDem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccountDem account = new BankAccountDem( 5000.0);

        System.out.println("-----------Welcome to the banking system-----------");
        while (true){
            System.out.println("\nAvailable options:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scan.nextLine());
                if (choice == 1) {
                    account.deposit(scan);
                } else if (choice == 2) {
                    account.withdraw(scan);
                } else if (choice == 3) {
                    account.checkBalance(scan);
                } else if (choice == 4) {
                    System.out.println("thank you ");
                    break;
                }else {
                    System.out.println("please select a valid option.");
                }
            }catch (Exception exception){
                System.err.println("invalid input. try again");
            }
        }
        scan.close();
    }
}
