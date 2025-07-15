class Ticketing {
    public static void generateTicket(String traveler, String destination) {
        System.out.println("Generating ticket for " + traveler + " to " + destination);

        BaggageCheck.scheduleCheck();

        System.out.println("Ticket issued");
    }
}