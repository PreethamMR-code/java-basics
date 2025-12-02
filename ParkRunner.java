class ParkRunner {
    public static void main(String[] args) {
        boolean result = Park.registerPark("Green Leaf Park", "Indiranagar", 4.5, true, "6:00 AM", "9:00 PM");

        System.out.println("Park Registered: " + result);

        if (result) {
            Park.getParkDetails();
        }
    }
}
