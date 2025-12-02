class Facebook {
    static String platformName;
    static String founder;
    static int launchYear;
    static String headquarters;
    static boolean hasMarketplace;
    static int dailyActiveUsers;

    public static boolean createFacebook(String name, String createdBy, int year, String hq, boolean marketplace, int users) {
        boolean isFacebookCreated = FacebookValidator.validateFacebook(name, createdBy, year, hq, marketplace, users);

        if (isFacebookCreated) {
            platformName = name;
            founder = createdBy;
            launchYear = year;
            headquarters = hq;
            hasMarketplace = marketplace;
            dailyActiveUsers = users;
        }

        return isFacebookCreated;
    }

    public static void readFacebook() {
        System.out.println("Platform Name: " + platformName);
        System.out.println("Founder: " + founder);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Has Marketplace: " + hasMarketplace);
        System.out.println("Daily Active Users: " + dailyActiveUsers);
    }
}