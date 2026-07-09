package com.vitalii.oop;

/**
 * @param accountNumber Instance variables (unique to each object)
 */
public record BankAccount(String accountNumber, double balance) {
    // Static variables (shared across all BankAccount objects)
    private static String bankName;
    private static double interestRate;

    // Constructor to initialize instance variables

    // --- Static Methods for Static Variables ---

    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    // --- Instance Methods ---

    // Method to print details of the BankAccount object
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        // Set static variables (applies to all instances)
        BankAccount.setBankName("Global Trust Bank");
        BankAccount.setInterestRate(3.5);

        // Create several 'BankAccount' objects
        BankAccount account1 = new BankAccount("ACC1001", 5500.50);
        BankAccount account2 = new BankAccount("ACC1002", 12300.00);
        BankAccount account3 = new BankAccount("ACC1003", 450.75);

        // Print their details along with the static variables
        System.out.println("--- Bank Account Details ---");
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();
    }
}
