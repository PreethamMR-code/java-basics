class DisneyLand {
    static String parkName;
    static String country;
    static int totalRides;
    static boolean hasWaterPark;
    static String openingTime;
    static String closingTime;

    public static boolean registerDisneyLand(String name, String location, int rides, boolean waterPark, String open, String close) {
        boolean isParkRegistered = false;

        boolean nameOk = false;
        boolean countryOk = false;
        boolean ridesOk = false;
        boolean waterParkOk = false;
        boolean openOk = false;
        boolean closeOk = false;

        if (name != null && !name.isEmpty()) {
            parkName = name;
            nameOk = true;
        } else {
            System.out.println("Park name is required.");
        }

        if (location != null && !location.isEmpty()) {
            country = location;
            countryOk = true;
        } else {
            System.out.println("Country name is missing.");
        }

        if (rides > 0) {
            totalRides = rides;
            ridesOk = true;
        } else {
            System.out.println("Number of rides must be more than 0.");
        }

        hasWaterPark = waterPark;
        waterParkOk = true;

        if (open != null && !open.isEmpty()) {
            openingTime = open;
            openOk = true;
        } else {
            System.out.println("Opening time is required.");
        }

        if (close != null && !close.isEmpty()) {
            closingTime = close;
            closeOk = true;
        } else {
            System.out.println("Closing time is required.");
        }

        if (nameOk && countryOk && ridesOk && waterParkOk && openOk && closeOk) {
            isParkRegistered = true;
        } else {
            System.out.println("DisneyLand registration failed.");
        }

        return isParkRegistered;
    }

    public static void getDisneyLandDetails() {
        System.out.println("Park Name: " + parkName);
        System.out.println("Country: " + country);
        System.out.println("Total Rides: " + totalRides);
        System.out.println("Has Water Park: " + hasWaterPark);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
    }
}
