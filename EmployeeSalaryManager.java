class EmployeeSalaryManager {
    public static void main(String[] args) {
        calculateSalary(20000, 5);
        calculateSalary(30000, 3);
        calculateSalary(25000, 4);
    }

    public static void calculateSalary(int base, int years) {
        int total = base + (years * 1000);
        System.out.println("Final Salary: ₹" + total);
    }
}