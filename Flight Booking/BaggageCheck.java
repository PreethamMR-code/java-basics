class BaggageCheck {
    public static void scheduleCheck() {
        System.out.println("Baggage check scheduled");

        Security.performCheck();

        System.out.println("Baggage cleared");
    }
}