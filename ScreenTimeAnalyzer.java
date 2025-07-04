class ScreenTimeAnalyzer {
    public static void main(String[] args) {
        analyzeScreenTime(8, 2);
        analyzeScreenTime(10, 4);
        analyzeScreenTime(5, 1);
    }

    public static void analyzeScreenTime(int hours, int productive) {
        int wasted = hours - productive;
        System.out.println("Unproductive Time: " + wasted + " hours");
    }
}