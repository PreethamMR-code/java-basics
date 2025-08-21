class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;
    String accountType;
    String branch;
    boolean isActive;

    BankAccount() {
        this("000000", "Unknown", 0.0, "Savings", "Main Branch", true);
    }
    BankAccount(String accountNumber) {
        this(accountNumber, "Unknown", 0.0, "Savings", "Main Branch", true);
    }
    BankAccount(String accountNumber, String accountHolder) {
        this(accountNumber, accountHolder, 0.0, "Savings", "Main Branch", true);
    }
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this(accountNumber, accountHolder, balance, "Savings", "Main Branch", true);
    }
    BankAccount(String accountNumber, String accountHolder, double balance, String accountType) {
        this(accountNumber, accountHolder, balance, accountType, "Main Branch", true);
    }
    BankAccount(String accountNumber, String accountHolder, double balance, String accountType, String branch) {
        this(accountNumber, accountHolder, balance, accountType, branch, true);
    }
    BankAccount(String accountNumber, String accountHolder, double balance, String accountType, String branch, boolean isActive) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
        this.branch = branch;
        this.isActive = isActive;
    }
    void display() {
        System.out.println("Account#: " + accountNumber + " Holder: " + accountHolder + " Balance: $" + balance + " Type: " + accountType + " Branch: " + branch + " Active: " + isActive);
    }
}

