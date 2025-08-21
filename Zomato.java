class Zomato {
    static String appName;
    static String founder;
    static int launchYear;
    static String headquarters;
    static boolean offersFoodDelivery;
    static int listedRestaurants;

    public static boolean createZomato(String name, String founderName, int year, String hq, boolean delivery, int restaurants) {
        boolean isZomatoCreated = ZomatoValidator.validateZomato(name, founderName, year, hq, delivery, restaurants);

        if (isZomatoCreated) {
            appName = name;
            founder = founderName;
            launchYear = year;
            headquarters = hq;
            offersFoodDelivery = delivery;
            listedRestaurants = restaurants;
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