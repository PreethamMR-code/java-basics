class Spotify {
    static String platformName;
    static String foundedBy;
    static int launchYear;
    static String headquarters;
    static boolean offersPodcasts;
    static int totalUsers;

    public static boolean createSpotify(String name, String founder, int year, String hq, boolean podcasts, int users) {
        boolean isSpotifyCreated = false;

        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean podcastOk = false;
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
            System.out.println("Launch year should be 2000 or later.");
        }

        if (hq != null && !hq.isEmpty()) {
            headquarters = hq;
            hqOk = true;
        } else {
            System.out.println("Headquarters is required.");
        }

        offersPodcasts = podcasts;
        podcastOk = true;

        if (users > 0) {
            totalUsers = users;
            usersOk = true;
        } else {
            System.out.println("Total users must be more than 0.");
        }

        if (nameOk && founderOk && yearOk && hqOk && podcastOk && usersOk) {
            isSpotifyCreated = true;
        } else {
            System.out.println("Spotify creation failed.");
        }

        return isSpotifyCreated;
    }

    public static void readSpotify() {
        System.out.println("Platform Name: " + platformName);
        System.out.println("Founded By: " + foundedBy);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Offers Podcasts: " + offersPodcasts);
        System.out.println("Total Users: " + totalUsers);
    }
}
