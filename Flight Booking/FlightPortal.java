class FlightPortal {
    public static void bookFlight(String traveler, int age, long contact, String email, String destination) {
        System.out.println("Booking flight ticket...");

        Ticketing.generateTicket(traveler, destination);

        System.out.println("Flight booked");
    }
}