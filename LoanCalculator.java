class LoanCalculator {
    public static void main(String[] args) {
        calculateEMI(100000, 12, 10);
        calculateEMI(50000, 10, 12);
        calculateEMI(250000, 24, 9);
    }

    public static void calculateEMI(int principal, int months, int rate) {
        int emi = (principal + (principal * rate / 100)) / months;
        System.out.println("Monthly EMI: ₹" + emi);
    }
