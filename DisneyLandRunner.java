class DisneyLandRunner {
    public static void main(String[] args) {
        boolean result = DisneyLand.registerDisneyLand("Disneyland Paris", "France", 50, true, "9:30 AM", "10:00 PM");

        System.out.println("DisneyLand Registered: " + result);

        if (result) {
            DisneyLand.getDisneyLandDetails();
        }
    }
}
