class Instagram {
    static String appName;
    static String launchedBy;
    static int launchedYear;
    static String ownedBy;
    static boolean hasStoriesFeature;
    static int activeMonthlyUsers;

    public static boolean createInstagram(String name, String founder, int year, String owner, boolean storiesFeature, int users) {
        boolean isInstagramCreated = false;

        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean ownerOk = false;
        boolean storiesOk = false;
        boolean usersOk = false;

        if (name != null && !name.isEmpty()) {
            appName = name;
            nameOk = true;
        } else {
            System.out.println("App name is required.");
        }

        if (founder != null && !founder.isEmpty()) {
            launchedBy = founder;
            founderOk = true;
        } else {
            System.out.println("Founder name is missing.");
        }

        if (year >= 2000) {
            launchedYear = year;
            yearOk = true;
        } else {
            System.out.println("Launch year must be 2000 or later.");
        }

        if (owner != null && !owner.isEmpty()) {
            ownedBy = owner;
            ownerOk = true;
        } else {
            System.out.println("Owner information is required.");
        }

        hasStoriesFeature = storiesFeature;
        storiesOk = true;

        if (users > 0) {
            activeMonthlyUsers = users;
            usersOk = true;
        } else {
            System.out.println("Active user count must be more than 0.");
        }

        if (nameOk && founderOk && yearOk && ownerOk && storiesOk && usersOk) {
            isInstagramCreated = true;
        } else {
            System.out.println("Instagram creation failed.");
        }

        return isInstagramCreated;
    }

    public static void readInstagram() {
        System.out.println("App Name: " + appName);
        System.out.println("Launched By: " + launchedBy);
        System.out.println("Launch Year: " + launchedYear);
        System.out.println("Owned By: " + ownedBy);
        System.out.println("Stories Feature Available: " + hasStoriesFeature);
        System.out.println("Monthly Active Users: " + activeMonthlyUsers);
    }
}
