class CarbonFootprintCalculator {
    public static void main(String[] args) {
        calculateCO2(100, 5);
        calculateCO2(50, 2);
        calculateCO2(200, 10);
    }

    public static void calculateCO2(int distance, int fuel) {
        int emission = distance * fuel * 2;
        System.out.println("Estimated CO2: " + emission + " grams");
    }
}