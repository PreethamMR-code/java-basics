class NetflixValidator {
    public static boolean validateNetflix(String name, String founder, int year, String hq, boolean originals, int subscribers) {
        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean originalsOk = true; // No validation needed for boolean
        boolean subscribersOk = false;

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

        if (year >= 1990) {
            yearOk = true;
        } else {
            System.out.println("Launch year must be 1990 or later.");
        }

        if (hq != null && !hq.isEmpty()) {
            hqOk = true;
        } else {
            System.out.println("Headquarters is required.");
        }

        if (subscribers > 0) {
            subscribersOk = true;
        } else {
            System.out.println("Total subscribers must be greater than 0.");
        }

        if (!nameOk || !founderOk || !yearOk || !hqOk || !subscribersOk) {
            System.out.println("Netflix creation failed.");
        }

        return nameOk && founderOk && yearOk && hqOk && originalsOk && subscribersOk;
    }
}