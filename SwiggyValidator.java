class SwiggyValidator {
    public static boolean validateSwiggy(String name, String founder, int year, String hq, boolean instamart, int partners) {
        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean instamartOk = true; // No validation needed for boolean
        boolean partnersOk = false;

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

        if (hq != null && !hq.isEmpty()) {
            hqOk = true;
        } else {
            System.out.println("Headquarters is required.");
        }

        if (partners > 0) {
            partnersOk = true;
        } else {
            System.out.println("Delivery partner count must be more than 0.");
        }

        if (!nameOk || !founderOk || !yearOk || !hqOk || !partnersOk) {
            System.out.println("Swiggy creation failed.");
        }

        return nameOk && founderOk && yearOk && hqOk && instamartOk && partnersOk;
    }
}