class Amazon {
    static String websiteName;
    static String founder;
    static int launchYear;
    static String headquarters;
    static boolean offersPrimeMembership;

    public static boolean createAmazon(String name, String founderName, int year, String hq, boolean primeAvailable) {
        boolean isAmazonCreated = false;

        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean primeOk = false;

        if (name != null && !name.isEmpty()) {
            websiteName = name;
            nameOk = true;
        } else {
            System.out.println("Website name is required.");
        }

        if (founderName != null && !founderName.isEmpty()) {
            founder = founderName;
            founderOk = true;
        } else {
            System.out.println("Founder name is missing.");
        }

        if (year >= 1990) {
            launchYear = year;
            yearOk = true;
        } else {
            System.out.println("Launch year must be 1990 or later.");
        }

        if (hq != null && !hq.isEmpty()) {
            headquarters = hq;
            hqOk = true;
        } else {
            System.out.println("Headquarters is required.");
        }

        offersPrimeMembership = primeAvailable;
        primeOk = true;

        if (nameOk && founderOk && yearOk && hqOk && primeOk) {
            isAmazonCreated = true;
        } else {
            System.out.println("Amazon website creation failed.");
        }

        return isAmazonCreated;
    }

    public static void readAmazon() {
        System.out.println("Website Name: " + websiteName);
        System.out.println("Founder: " + founder);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Prime Membership Available: " + offersPrimeMembership);
    }
}
