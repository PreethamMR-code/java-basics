class Flipkart {
    static String companyName;
    static String foundedBy;
    static int launchYear;
    static String headquarters;
    static boolean offersGroceryDelivery;
    static int totalEmployees;

    public static boolean createFlipkart(String name, String founder, int year, String hq, boolean grocery, int employees) {
        boolean isFlipkartCreated = FlipkartValidator.validateFlipkart(name, founder, year, hq, grocery, employees);

        if (isFlipkartCreated) {
            companyName = name;
            foundedBy = founder;
            launchYear = year;
            headquarters = hq;
            offersGroceryDelivery = grocery;
            totalEmployees = employees;
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