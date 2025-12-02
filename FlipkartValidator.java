class FlipkartValidator {
    public static boolean validateFlipkart(String name, String founder, int year, String hq, boolean grocery, int employees) {
        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean groceryOk = true; // No validation needed for boolean
        boolean employeesOk = false;

        if (name != null && !name.isEmpty()) {
            nameOk = true;
        } else {
            System.out.println("Company name is required.");
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

        if (employees > 0) {
            employeesOk = true;
        } else {
            System.out.println("Total employees must be greater than 0.");
        }

        if (!nameOk || !founderOk || !yearOk || !hqOk || !employeesOk) {
            System.out.println("Flipkart creation failed.");
        }

        return nameOk && founderOk && yearOk && hqOk && groceryOk && employeesOk;
    }
}