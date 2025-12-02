class Gold {
    static String itemName;
    static double weightInGrams;
    static String purityLevel;
    static String designType;
    static String sellerName;
    static double price;

    public static boolean registerGold(String name, double weight, String purity, String design, String seller, double cost) {
        boolean isGoldRegistered = false;

        boolean nameOk = false;
        boolean weightOk = false;
        boolean purityOk = false;
        boolean designOk = false;
        boolean sellerOk = false;
        boolean priceOk = false;

        if (name != null && !name.isEmpty()) {
            itemName = name;
            nameOk = true;
        } else {
            System.out.println("Item name is required.");
        }

        if (weight > 0) {
            weightInGrams = weight;
            weightOk = true;
        } else {
            System.out.println("Weight must be greater than 0.");
        }

        if (purity != null && !purity.isEmpty()) {
            purityLevel = purity;
            purityOk = true;
        } else {
            System.out.println("Please specify purity (like 22K or 24K).");
        }

        if (design != null && !design.isEmpty()) {
            designType = design;
            designOk = true;
        } else {
            System.out.println("Design type is missing.");
        }

        if (seller != null && !seller.isEmpty()) {
            sellerName = seller;
            sellerOk = true;
        } else {
            System.out.println("Seller name is required.");
        }

        if (cost > 0) {
            price = cost;
            priceOk = true;
        } else {
            System.out.println("Price must be greater than 0.");
        }

        if (nameOk && weightOk && purityOk && designOk && sellerOk && priceOk) {
            isGoldRegistered = true;
        } else {
            System.out.println("Gold registration failed.");
        }

        return isGoldRegistered;
    }

    public static void getGoldDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Weight: " + weightInGrams + "g");
        System.out.println("Purity: " + purityLevel);
        System.out.println("Design Type: " + designType);
        System.out.println("Seller: " + sellerName);
        System.out.println("Price: ₹" + price);
    }
}
