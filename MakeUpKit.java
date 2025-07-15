class MakeUpKit {
    static String kitName;
    static String brand;
    static int numberOfItems;
    static boolean includesMirror;
    static String colorTheme;
    static double price;

    public static boolean registerMakeUpKit(String name, String brandName, int items, boolean mirror, String theme, double cost) {
        boolean isKitRegistered = false;

        boolean nameOk = false;
        boolean brandOk = false;
        boolean itemsOk = false;
        boolean mirrorOk = false;
        boolean themeOk = false;
        boolean priceOk = false;

        if (name != null && !name.isEmpty()) {
            kitName = name;
            nameOk = true;
        } else {
            System.out.println("Kit name is required.");
        }

        if (brandName != null && !brandName.isEmpty()) {
            brand = brandName;
            brandOk = true;
        } else {
            System.out.println("Brand name is missing.");
        }

        if (items > 0) {
            numberOfItems = items;
            itemsOk = true;
        } else {
            System.out.println("Item count must be greater than 0.");
        }

        includesMirror = mirror;
        mirrorOk = true;

        if (theme != null && !theme.isEmpty()) {
            colorTheme = theme;
            themeOk = true;
        } else {
            System.out.println("Color theme is missing.");
        }

        if (cost > 0) {
            price = cost;
            priceOk = true;
        } else {
            System.out.println("Price must be valid.");
        }

        if (nameOk && brandOk && itemsOk && mirrorOk && themeOk && priceOk) {
            isKitRegistered = true;
        } else {
            System.out.println("Makeup kit registration failed.");
        }

        return isKitRegistered;
    }

    public static void getMakeUpKitDetails() {
        System.out.println("Kit Name: " + kitName);
        System.out.println("Brand: " + brand);
        System.out.println("Number of Items: " + numberOfItems);
        System.out.println("Includes Mirror: " + includesMirror);
        System.out.println("Color Theme: " + colorTheme);
        System.out.println("Price: ₹" + price);
    }
}
