class Park {
    static String parkName;
    static String locationArea;
    static double sizeInAcres;
    static boolean hasPlayground;
    static String openingTime;
    static String closingTime;

    public static boolean registerPark(String name, String area, double size, boolean playground, String open, String close) {
        boolean isParkRegistered = false;

        boolean nameOk = false;
        boolean areaOk = false;
        boolean sizeOk = false;
        boolean playgroundOk = false;
        boolean openOk = false;
        boolean closeOk = false;

        if (name != null && !name.isEmpty()) {
            parkName = name;
            nameOk = true;
        } else {
            System.out.println("Park name is required.");
        }

        if (area != null && !area.isEmpty()) {
            locationArea = area;
            areaOk = true;
        } else {
            System.out.println("Location is missing.");
        }

        if (size > 0) {
            sizeInAcres = size;
            sizeOk = true;
        } else {
            System.out.println("Park size must be greater than 0.");
        }

        hasPlayground = playground;
        playgroundOk = true;

        if (open != null && !open.isEmpty()) {
            openingTime = open;
            openOk = true;
        } else {
            System.out.println("Opening time is missing.");
        }

        if (close != null && !close.isEmpty()) {
            closingTime = close;
            closeOk = true;
        } else {
            System.out.println("Closing time is required.");
        }

        if (nameOk && areaOk && sizeOk && playgroundOk && openOk && closeOk) {
            isParkRegistered = true;
        } else {
            System.out.println("Park registration failed.");
        }

        return isParkRegistered;
    }

    public static void getParkDetails() {
        System.out.println("Park Name: " + parkName);
        System.out.println("Location Area: " + locationArea);
        System.out.println("Size: " + sizeInAcres + " acres");
        System.out.println("Has Playground: " + hasPlayground);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
    }
}
