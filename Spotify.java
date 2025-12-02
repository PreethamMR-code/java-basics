class Spotify {
    static String platformName;
    static String foundedBy;
    static int launchYear;
    static String headquarters;
    static boolean offersPodcasts;
    static int totalUsers;

    public static boolean createSpotify(String name, String founder, int year, String hq, boolean podcasts, int users) {
        boolean isSpotifyCreated = SpotifyValidator.validateSpotify(name, founder, year, hq, podcasts, users);

        if (isSpotifyCreated) {
            platformName = name;
            foundedBy = founder;
            launchYear = year;
            headquarters = hq;
            offersPodcasts = podcasts;
            totalUsers = users;
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