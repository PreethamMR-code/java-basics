class BatteryAnalyzer {
    public static void main(String[] args) {
        checkBatteryHealth(500, 300);
        checkBatteryHealth(400, 280);
        checkBatteryHealth(600, 420);
    }

    public static void checkBatteryHealth(int fullCharge, int currentCharge) {
        int percent = (currentCharge * 100) / fullCharge;
        System.out.println("Battery Health: " + percent + "%");
    }
}