class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.display();
        BankAccount ba2 = new BankAccount("123456");
        ba2.display();
        BankAccount ba3 = new BankAccount("987654", "John Doe");
        ba3.display();
        BankAccount ba4 = new BankAccount("456789", "Jane Smith", 5000.50);
        ba4.display();
        BankAccount ba5 = new BankAccount("112233", "Robert Brown", 7500, "Checking");
        ba5.display();
        BankAccount ba6 = new BankAccount("445566", "Emily Clark", 10000, "Savings", "West Branch");
        ba6.display();
        BankAccount ba7 = new BankAccount("778899", "Michael Lee", 20000, "Savings", "East Branch", false);
        ba7.display();
    }
}
