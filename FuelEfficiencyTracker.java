class FuelEfficiencyTracker {
    public static void main(String[] args) {
        calculateMileage(400, 20);
        calculateMileage(300, 15);
        calculateMileage(500, 25);
    }

    public static void calculateMileage(int km, int liters) {
        System.out.println("Mileage: " + (km / liters) + " km/l");
    }
}