class TravelAgency {
    public static void bookTrip(String travelerName, int age, long phone, String email, String destination) {
        System.out.println("Trip booking started");
        
        Agent.planTrip(travelerName, destination);
        
        System.out.println("Trip booking completed");
    }
}