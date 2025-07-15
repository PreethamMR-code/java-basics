class Flipkart {
    static String companyName;
    static String foundedBy;
    static int launchYear;
    static String headquarters;
    static boolean offersGroceryDelivery;
    static int totalEmployees;

    public static boolean createFlipkart(String name, String founder, int year, String hq, boolean grocery, int employees) {
        boolean isFlipkartCreated = false;

        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean groceryOk = false;
        boolean employeesOk = false;

        if (name != null && !name.isEmpty()) {
            companyName = name;
            nameOk = true;
        } else {
            System.out.println("Company name is required.");
        }

        if (founder != null && !founder.isEmpty()) {
            foundedBy = founder;
            founderOk = true;
        } else {
            System.out.println("Founder name is missing.");
        }

        if (year >= 2000) {
            launchYear = year;
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

        offersGroceryDelivery = grocery;
        groceryOk = true;

        if (employees > 0) {
            totalEmployees = employees;
            employeesOk = true;
        } else {
            System.out.println("Total employees must be greater than 0.");
        }

        if (nameOk && founderOk && yearOk && hqOk && groceryOk && employeesOk) {
            isFlipkartCreated = true;
        } else {
            System.out.println("Flipkart creation failed.");
        }

        return isFlipkartCreated;
    }

    public static void readFlipkart() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Founded By: " + foundedBy);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Offers Grocery Delivery: " + offersGroceryDelivery);
        System.out.println("Total Employees: " + totalEmployees);
    }
}
