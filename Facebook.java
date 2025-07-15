class Facebook {
    static String platformName;
    static String founder;
    static int launchYear;
    static String headquarters;
    static boolean hasMarketplace;
    static int dailyActiveUsers;

    public static boolean createFacebook(String name, String createdBy, int year, String hq, boolean marketplace, int users) {
        boolean isFacebookCreated = false;

        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean marketOk = false;
        boolean usersOk = false;

        if (name != null && !name.isEmpty()) {
            platformName = name;
            nameOk = true;
        } else {
            System.out.println("Platform name is required.");
        }

        if (createdBy != null && !createdBy.isEmpty()) {
            founder = createdBy;
            founderOk = true;
        } else {
            System.out.println("Founder name is missing.");
        }

        if (year >= 2000) {
            launchYear = year;
            yearOk = true;
        } else {
            System.out.println("Launch year must be 2000 or later.");
        }

        if (hq != null && !hq.isEmpty()) {
            headquarters = hq;
            hqOk = true;
        } else {
            System.out.println("Headquarters is required.");
        }

        hasMarketplace = marketplace;
        marketOk = true;

        if (users > 0) {
            dailyActiveUsers = users;
            usersOk = true;
        } else {
            System.out.println("Active users must be more than 0.");
        }

        if (nameOk && founderOk && yearOk && hqOk && marketOk && usersOk) {
            isFacebookCreated = true;
        } else {
            System.out.println("Facebook creation failed.");
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
