class ZomatoValidator {
    public static boolean validateZomato(String name, String founder, int year, String hq, boolean delivery, int restaurants) {
        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean deliveryOk = true; // No validation needed for boolean
        boolean restaurantsOk = false;

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

        if (restaurants > 0) {
            restaurantsOk = true;
        } else {
            System.out.println("Number of restaurants must be greater than 0.");
        }

        if (!nameOk || !founderOk || !yearOk || !hqOk || !restaurantsOk) {
            System.out.println("Zomato creation failed.");
        }

        return nameOk && founderOk && yearOk && hqOk && deliveryOk && restaurantsOk;
    }
}