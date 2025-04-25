// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom exception for negative withdrawal
class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }
}


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);

        try {
            System.out.println("Attempting to withdraw $100...");
            account.withdraw(100); // Should succeed

            System.out.println("Attempting to withdraw $600...");
            account.withdraw(600); // Should throw InsufficientFundsException

            System.out.println("Attempting to withdraw -$50...");
            account.withdraw(-50); // Should throw NegativeAmountException
        } catch (InsufficientFundsException | NegativeAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
