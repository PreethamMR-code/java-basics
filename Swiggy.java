class Swiggy {
    static String appName;
    static String founder;
    static int launchYear;
    static String headquarters;
    static boolean hasInstamart;
    static int deliveryPartners;

    public static boolean createSwiggy(String name, String founderName, int year, String hq, boolean instamart, int partners) {
        boolean isSwiggyCreated = SwiggyValidator.validateSwiggy(name, founderName, year, hq, instamart, partners);

        if (isSwiggyCreated) {
            appName = name;
            founder = founderName;
            launchYear = year;
            headquarters = hq;
            hasInstamart = instamart;
            deliveryPartners = partners;
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