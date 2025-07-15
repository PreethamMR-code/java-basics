class Netflix {
    static String platformName;
    static String founder;
    static int launchYear;
    static String headquarters;
    static boolean offersOriginalSeries;
    static int totalSubscribers;

    public static boolean createNetflix(String name, String founderName, int year, String hq, boolean originals, int subscribers) {
        boolean isNetflixCreated = false;

        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean originalsOk = false;
        boolean subscribersOk = false;

        if (name != null && !name.isEmpty()) {
            platformName = name;
            nameOk = true;
        } else {
            System.out.println("Platform name is required.");
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

        offersOriginalSeries = originals;
        originalsOk = true;

        if (subscribers > 0) {
            totalSubscribers = subscribers;
            subscribersOk = true;
        } else {
            System.out.println("Total subscribers must be greater than 0.");
        }

        if (nameOk && founderOk && yearOk && hqOk && originalsOk && subscribersOk) {
            isNetflixCreated = true;
        } else {
            System.out.println("Netflix creation failed.");
        }

        return isNetflixCreated;
    }

    public static void readNetflix() {
        System.out.println("Platform Name: " + platformName);
        System.out.println("Founder: " + founder);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Offers Original Series: " + offersOriginalSeries);
        System.out.println("Total Subscribers: " + totalSubscribers);
    }
}
