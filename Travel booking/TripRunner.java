class TripRunner {
    static String travelerName = "Nisha";
    static int age = 28;
    static long phone = 9876543210L;
    static String email = "nisha@example.com";
    static String destination = "Manali";

    public static void main(String[] args) {
        System.out.println("Traveler Name: " + travelerName);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Destination: " + destination);
        
        TravelAgency.bookTrip(travelerName, age, phone, email, destination);
    }
}