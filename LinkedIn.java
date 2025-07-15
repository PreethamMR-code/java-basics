class LinkedIn {
    static String platformName;
    static String foundedBy;
    static int launchYear;
    static String headquarters;
    static boolean usedForJobSearch;
    static int totalUsers;

    public static boolean createLinkedIn(String name, String founder, int year, String hq, boolean jobSearch, int users) {
        boolean isLinkedInCreated = false;

        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean jobOk = false;
        boolean usersOk = false;

        if (name != null && !name.isEmpty()) {
            platformName = name;
            nameOk = true;
        } else {
            System.out.println("Platform name is required.");
        }

        if (founder != null && !founder.isEmpty()) {
            foundedBy = founder;
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

        usedForJobSearch = jobSearch;
        jobOk = true;

        if (users > 0) {
            totalUsers = users;
            usersOk = true;
        } else {
            System.out.println("Total users must be more than 0.");
        }

        if (nameOk && founderOk && yearOk && hqOk && jobOk && usersOk) {
            isLinkedInCreated = true;
        } else {
            System.out.println("LinkedIn creation failed.");
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
