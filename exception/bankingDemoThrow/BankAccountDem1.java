package exception.bankingDemoThrow;

public class BankAccountDem1 {
    private double balance;

    public BankAccountDem1(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited Rs" + amount + ". Current balance: Rs" + balance);
    }

    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds. Current balance: Rs" + balance);
        }
        balance -= amount;
        System.out.println("Withdrew Rs" + amount + ". Current balance: Rs" + balance);
    }

    public void checkBalance() {
        System.out.println("Current balance: Rs" + balance);
    }
}

