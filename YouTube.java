class YouTube {
    static String platformName;
    static String createdBy;
    static int launchedYear;
    static String headquarters;
    static boolean supportsLiveStreaming;
    static int numberOfCreators;

    public static boolean createYouTube(String name, String founder, int year, String hq, boolean live, int creators) {
        boolean isYouTubeCreated = false;

        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean liveOk = false;
        boolean creatorsOk = false;

        if (name != null && !name.isEmpty()) {
            platformName = name;
            nameOk = true;
        } else {
            System.out.println("Platform name is required.");
        }

        if (founder != null && !founder.isEmpty()) {
            createdBy = founder;
            founderOk = true;
        } else {
            System.out.println("Founder name is missing.");
        }

        if (year >= 2000) {
            launchedYear = year;
            yearOk = true;
        } else {
            System.out.println("Launch year should be 2000 or later.");
        }

        if (hq != null && !hq.isEmpty()) {
            headquarters = hq;
            hqOk = true;
        } else {
            System.out.println("Headquarters location is required.");
        }

        supportsLiveStreaming = live;
        liveOk = true;

        if (creators > 0) {
            numberOfCreators = creators;
            creatorsOk = true;
        } else {
            System.out.println("Number of creators must be more than 0.");
        }

        if (nameOk && founderOk && yearOk && hqOk && liveOk && creatorsOk) {
            isYouTubeCreated = true;
        } else {
            System.out.println("YouTube creation failed.");
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
