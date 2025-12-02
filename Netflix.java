class Netflix {
    static String platformName;
    static String founder;
    static int launchYear;
    static String headquarters;
    static boolean offersOriginalSeries;
    static int totalSubscribers;

    public static boolean createNetflix(String name, String founderName, int year, String hq, boolean originals, int subscribers) {
        boolean isNetflixCreated = NetflixValidator.validateNetflix(name, founderName, year, hq, originals, subscribers);

        if (isNetflixCreated) {
            platformName = name;
            founder = founderName;
            launchYear = year;
            headquarters = hq;
            offersOriginalSeries = originals;
            totalSubscribers = subscribers;
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