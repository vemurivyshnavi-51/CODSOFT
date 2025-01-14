import java.util.Scanner;

class BankAccount {
    private double balance;

    // Constructor to initialize account with a balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
            return false;
        }
    }
}

class ATM {
    private BankAccount account;

    // Constructor to initialize ATM with the user's bank account
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Method to check the balance of the account
    public void checkBalance() {
        System.out.println("Current balance: $" + account.getBalance());
    }

    // Method to deposit money
    public void deposit(double amount) {
        account.deposit(amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    // Method to display ATM options
    public void showMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize account with a balance of $1000
        BankAccount account = new BankAccount(1000);
        ATM atm = new ATM(account);

        while (true) {
            atm.showMenu();
            System.out.print("Choose an option (1-4): ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
