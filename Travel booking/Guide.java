class Guide {
    public static void prepareItinerary(String destination) {
        System.out.println("Preparing itinerary for " + destination);
        
        Driver.arrangeTransport();
        
        System.out.println("Itinerary ready");
    }
}