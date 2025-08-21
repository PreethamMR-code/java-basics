class InstagramValidator {
    public static boolean validateInstagram(String name, String founder, int year, String owner, boolean storiesFeature, int users) {
        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean ownerOk = false;
        boolean storiesOk = true; // No validation needed for boolean
        boolean usersOk = false;

        if (name != null && !name.isEmpty()) {
            nameOk = true;
        } else {
            System.out.println("App name is required.");
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

        if (owner != null && !owner.isEmpty()) {
            ownerOk = true;
        } else {
            System.out.println("Owner information is required.");
        }

        if (users > 0) {
            usersOk = true;
        } else {
            System.out.println("Active user count must be more than 0.");
        }

        if (!nameOk || !founderOk || !yearOk || !ownerOk || !usersOk) {
            System.out.println("Instagram creation failed.");
        }

        return nameOk && founderOk && yearOk && ownerOk && storiesOk && usersOk;
    }
}