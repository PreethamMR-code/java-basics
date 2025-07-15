class Swiggy {
    static String appName;
    static String founder;
    static int launchYear;
    static String headquarters;
    static boolean hasInstamart;
    static int deliveryPartners;

    public static boolean createSwiggy(String name, String founderName, int year, String hq, boolean instamart, int partners) {
        boolean isSwiggyCreated = false;

        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean instamartOk = false;
        boolean partnersOk = false;

        if (name != null && !name.isEmpty()) {
            appName = name;
            nameOk = true;
        } else {
            System.out.println("App name is required.");
        }

        if (founderName != null && !founderName.isEmpty()) {
            founder = founderName;
            founderOk = true;
        } else {
            System.out.println("Founder name is missing.");
        }

        if (year >= 2000) {
            launchYear = year;
            yearOk = true;
        } else {
            System.out.println("Launch year must be 2000 or later.");
        }

        if (hq != null && !hq.isEmpty()) {
            headquarters = hq;
            hqOk = true;
        } else {
            System.out.println("Headquarters is required.");
        }

        hasInstamart = instamart;
        instamartOk = true;

        if (partners > 0) {
            deliveryPartners = partners;
            partnersOk = true;
        } else {
            System.out.println("Delivery partner count must be more than 0.");
        }

        if (nameOk && founderOk && yearOk && hqOk && instamartOk && partnersOk) {
            isSwiggyCreated = true;
        } else {
            System.out.println("Swiggy creation failed.");
        }

        return isSwiggyCreated;
    }

    public static void readSwiggy() {
        System.out.println("App Name: " + appName);
        System.out.println("Founder: " + founder);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Has Instamart: " + hasInstamart);
        System.out.println("Delivery Partners: " + deliveryPartners);
    }
}
