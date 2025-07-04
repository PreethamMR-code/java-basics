class NoisePollutionAnalyzer {
    public static void main(String[] args) {
        checkNoiseLevel(75);
        checkNoiseLevel(55);
        checkNoiseLevel(90);
    }

    public static void checkNoiseLevel(int db) {
        String level = db > 70 ? "High" : "Acceptable";
        System.out.println("Noise Level: " + level);
    }
}