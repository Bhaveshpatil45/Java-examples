package exception.bankingDemoTryCatch;

import java.util.Scanner;

public class BankAccountDem {
    private double balance;

    public BankAccountDem(double balance){
        this.balance = balance;
    }

    public void deposit(Scanner scan){
        System.out.println("Enter amount to deposit: ");
        try{
            double amount = Double.parseDouble(scan.nextLine());
            if (amount > 0){
                balance += amount;
                System.out.println("Deposited Rs" + amount + ". Current balance: Rs" + balance);
            }else {
                System.out.println("Deposit amount must be positive.");
            }
        }catch (Exception e){
            System.err.println("Invalid input.enter valid amount.");
        }
    }

    public void withdraw(Scanner scan){
        System.out.println("Enter amount to withdraw: ");
        try {
            double amount = Double.parseDouble(scan.nextLine());
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew Rs" + amount + ". Current balance: Rs" + balance);
            } else if (amount > balance) {
                System.out.println("Insufficient funds. Current balance: Rs" + balance);
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter a valid amount.");
        }
    }
    public void checkBalance(Scanner scan){
        System.out.println("Current Balance: Rs" + balance);
    }
}
