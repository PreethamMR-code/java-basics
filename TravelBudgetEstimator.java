class TravelBudgetEstimator {
    public static void main(String[] args) {
        estimateTripCost(5, 2000);
        estimateTripCost(3, 3000);
        estimateTripCost(7, 1500);
    }

    public static void estimateTripCost(int days, int costPerDay) {
        int total = days * costPerDay;
        System.out.println("Estimated Trip Cost: ₹" + total);
    }
}