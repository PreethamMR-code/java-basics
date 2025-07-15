class BookingSystem {
    public static void bookTicket(String userName, int age, long mobile, String email, String movieName) {
        System.out.println("Ticket booking started");

        Theater.allocateSeat(movieName);

        System.out.println("Ticket booking done");
    }
}