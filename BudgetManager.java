class BudgetManager {
    public static void main(String[] args) {
        trackExpenses(25000, 18000);
        trackExpenses(40000, 35000);
        trackExpenses(15000, 14000);
    }

    public static void trackExpenses(int income, int expense) {
        int balance = income - expense;
        System.out.println("Remaining: ₹" + balance);
    }
}