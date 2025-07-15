class Theater {
    public static void allocateSeat(String movieName) {
        System.out.println("Allocating seat for: " + movieName);

        Counter.generateTicket();

        System.out.println("Seat allocated");
    }
}