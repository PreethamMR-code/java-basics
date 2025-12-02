class Agent {
    public static void planTrip(String travelerName, String destination) {
        System.out.println("Planning the trip for " + travelerName);
        
        Guide.prepareItinerary(destination);
        
        System.out.println("Trip plan completed");
    }
}