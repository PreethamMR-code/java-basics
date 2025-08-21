class YouTube {
    static String platformName;
    static String createdBy;
    static int launchedYear;
    static String headquarters;
    static boolean supportsLiveStreaming;
    static int numberOfCreators;

    public static boolean createYouTube(String name, String founder, int year, String hq, boolean live, int creators) {
        boolean isYouTubeCreated = YouTubeValidator.validateYouTube(name, founder, year, hq, live, creators);

        if (isYouTubeCreated) {
            platformName = name;
            createdBy = founder;
            launchedYear = year;
            headquarters = hq;
            supportsLiveStreaming = live;
            numberOfCreators = creators;
        }

        return isYouTubeCreated;
    }

    public static void readYouTube() {
        System.out.println("Platform Name: " + platformName);
        System.out.println("Created By: " + createdBy);
        System.out.println("Launched Year: " + launchedYear);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Live Streaming Support: " + supportsLiveStreaming);
        System.out.println("Number of Creators: " + numberOfCreators);
    }
}