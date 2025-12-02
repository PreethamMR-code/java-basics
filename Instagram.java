class Instagram {
    static String appName;
    static String launchedBy;
    static int launchedYear;
    static String ownedBy;
    static boolean hasStoriesFeature;
    static int activeMonthlyUsers;

    public static boolean createInstagram(String name, String founder, int year, String owner, boolean storiesFeature, int users) {
        boolean isInstagramCreated = InstagramValidator.validateInstagram(name, founder, year, owner, storiesFeature, users);

        if (isInstagramCreated) {
            appName = name;
            launchedBy = founder;
            launchedYear = year;
            ownedBy = owner;
            hasStoriesFeature = storiesFeature;
            activeMonthlyUsers = users;
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