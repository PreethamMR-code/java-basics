class LinkedIn {
    static String platformName;
    static String foundedBy;
    static int launchYear;
    static String headquarters;
    static boolean usedForJobSearch;
    static int totalUsers;

    public static boolean createLinkedIn(String name, String founder, int year, String hq, boolean jobSearch, int users) {
        boolean isLinkedInCreated = LinkedInValidator.validateLinkedIn(name, founder, year, hq, jobSearch, users);

        if (isLinkedInCreated) {
            platformName = name;
            foundedBy = founder;
            launchYear = year;
            headquarters = hq;
            usedForJobSearch = jobSearch;
            totalUsers = users;
        }

        return isLinkedInCreated;
    }

    public static void readLinkedIn() {
        System.out.println("Platform Name: " + platformName);
        System.out.println("Founded By: " + foundedBy);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Used For Job Search: " + usedForJobSearch);
        System.out.println("Total Users: " + totalUsers);
    }
}