//>>>>>: Account Class:

public class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    void withdraw(double amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds. Withdrawal amount exceeds balance.");
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }

        double getBalance() {
        return balance;
    }
}



//>>>>>: Main Class:

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Account account = new Account("123456789", 1000.00);

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the amount to withdraw: ");
        double amountToWithdraw = scanner.nextDouble();

        try {
            account.withdraw(amountToWithdraw);
        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
