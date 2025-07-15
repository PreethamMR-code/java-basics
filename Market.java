class Market {
    static String marketName;
    static String areaName;
    static int totalShops;
    static String mainCategory;
    static String openTimings;

    public static boolean registerMarket(String name, String area, int shops, String category, String timing) {
        boolean isMarketRegistered = false;

        boolean nameOk = false;
        boolean areaOk = false;
        boolean shopOk = false;
        boolean categoryOk = false;
        boolean timingOk = false;

        if (name != null && !name.isEmpty()) {
            marketName = name;
            nameOk = true;
        } else {
            System.out.println("Market name is required.");
        }

        if (area != null && !area.isEmpty()) {
            areaName = area;
            areaOk = true;
        } else {
            System.out.println("Please enter a valid area name.");
        }

        if (shops > 0) {
            totalShops = shops;
            shopOk = true;
        } else {
            System.out.println("Shop count must be greater than zero.");
        }

        if (category != null && !category.isEmpty()) {
            mainCategory = category;
            categoryOk = true;
        } else {
            System.out.println("Please specify the main category.");
        }

        if (timing != null && !timing.isEmpty()) {
            openTimings = timing;
            timingOk = true;
        } else {
            System.out.println("Opening hours are missing.");
        }

        if (nameOk && areaOk && shopOk && categoryOk && timingOk) {
            isMarketRegistered = true;
        } else {
            System.out.println("Market registration failed.");
        }

        return isMarketRegistered;
    }

    public static void getMarketDetails() {
        System.out.println("Market Name: " + marketName);
        System.out.println("Located in: " + areaName);
        System.out.println("Total Shops: " + totalShops);
        System.out.println("Main Category: " + mainCategory);
        System.out.println("Open Timings: " + openTimings);
    }
}
