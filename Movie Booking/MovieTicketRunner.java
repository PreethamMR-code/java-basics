class MovieTicketRunner {
    static String userName = "Meena";
    static int age = 24;
    static long mobile = 9988776655L;
    static String email = "meena@gmail.com";
    static String movieName = "Dream Voyage";

    public static void main(String[] args) {
        System.out.println("User Name: " + userName);
        System.out.println("Age: " + age);
        System.out.println("Mobile: " + mobile);
        System.out.println("Email: " + email);
        System.out.println("Movie: " + movieName);

        BookingSystem.bookTicket(userName, age, mobile, email, movieName);
    }
}