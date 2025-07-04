class WaterTracker {
    public static void main(String[] args) {
        logWater(3, 5);
        logWater(2, 4);
        logWater(4, 6);
    }

    public static void logWater(int bottles, int litersPerBottle) {
        int total = bottles * litersPerBottle;
        System.out.println("Water Consumed: " + total + " liters");
    }
}