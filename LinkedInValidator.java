class LinkedInValidator {
    public static boolean validateLinkedIn(String name, String founder, int year, String hq, boolean jobSearch, int users) {
        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean jobOk = true; // No validation needed for boolean
        boolean usersOk = false;

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
            System.out.println("Launch year must be 2000 or later.");
        }

        if (hq != null && !hq.isEmpty()) {
            hqOk = true;
        } else {
            System.out.println("Headquarters is required.");
        }

        if (users > 0) {
            usersOk = true;
        } else {
            System.out.println("Total users must be more than 0.");
        }

        if (!nameOk || !founderOk || !yearOk || !hqOk || !usersOk) {
            System.out.println("LinkedIn creation failed.");
        }

        return nameOk && founderOk && yearOk && hqOk && jobOk && usersOk;
    }
}