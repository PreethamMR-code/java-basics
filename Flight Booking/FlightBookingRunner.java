class FlightBookingRunner {
    static String traveler = "Ishita";
    static int age = 27;
    static long contact = 9001234567L;
    static String email = "ishita@travel.com";
    static String destination = "Goa";

    public static void main(String[] args) {
        System.out.println("Traveler: " + traveler);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contact);
        System.out.println("Email: " + email);
        System.out.println("Destination: " + destination);

        FlightPortal.bookFlight(traveler, age, contact, email, destination);
    }
}