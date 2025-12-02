class YouTubeValidator {
    public static boolean validateYouTube(String name, String founder, int year, String hq, boolean live, int creators) {
        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean liveOk = true; // No validation needed for boolean
        boolean creatorsOk = false;

        if (name != null && !name.isEmpty()) {
            nameOk = true;
        } else {
            System.out.println("Platform name is required.");
        }

        if (founder != null && !founder.isEmpty()) {
            founderOk = true;
        } else {
            System.out.println("Founder name is missing.");
        }

        if (year >= 2000) {
            yearOk = true;
        } else {
            System.out.println("Launch year should be 2000 or later.");
        }

        if (hq != null && !hq.isEmpty()) {
            hqOk = true;
        } else {
            System.out.println("Headquarters location is required.");
        }

        if (creators > 0) {
            creatorsOk = true;
        } else {
            System.out.println("Number of creators must be more than 0.");
        }

        if (!nameOk || !founderOk || !yearOk || !hqOk || !creatorsOk) {
            System.out.println("YouTube creation failed.");
        }

        return nameOk && founderOk && yearOk && hqOk && liveOk && creatorsOk;
    }
}