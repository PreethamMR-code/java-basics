class DeliveryTrack {
    public static void trackStatus() {
        System.out.println("Tracking delivery status...");

        ReviewSystem.requestReview();

        System.out.println("Package arrived");
    }
}