class Zomato {
    static String appName;
    static String founder;
    static int launchYear;
    static String headquarters;
    static boolean offersFoodDelivery;
    static int listedRestaurants;

    public static boolean createZomato(String name, String founderName, int year, String hq, boolean delivery, int restaurants) {
        boolean isZomatoCreated = false;

        boolean nameOk = false;
        boolean founderOk = false;
        boolean yearOk = false;
        boolean hqOk = false;
        boolean deliveryOk = false;
        boolean restaurantsOk = false;

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

        offersFoodDelivery = delivery;
        deliveryOk = true;

        if (restaurants > 0) {
            listedRestaurants = restaurants;
            restaurantsOk = true;
        } else {
            System.out.println("Number of restaurants must be greater than 0.");
        }

        if (nameOk && founderOk && yearOk && hqOk && deliveryOk && restaurantsOk) {
            isZomatoCreated = true;
        } else {
            System.out.println("Zomato creation failed.");
        }

        return isZomatoCreated;
    }

    public static void readZomato() {
        System.out.println("App Name: " + appName);
        System.out.println("Founder: " + founder);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Offers Food Delivery: " + offersFoodDelivery);
        System.out.println("Listed Restaurants: " + listedRestaurants);
    }
}
