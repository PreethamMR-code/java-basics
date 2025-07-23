class Tyre {
    static String brand;
    static String type; 
    static int sizeInInches;
    static boolean isForTwoWheeler;
    static String gripType;
    static double price;

    public static boolean registerTyre(String tyreBrand, String tyreType, int size, boolean isBikeTyre, String grip, double cost) {
        boolean isTyreRegistered = false;

        boolean brandOk = false;
        boolean typeOk = false;
        boolean sizeOk = false;
        boolean vehicleOk = false;
        boolean gripOk = false;
        boolean priceOk = false;

        if (tyreBrand != null && !tyreBrand.isEmpty()) {
            brand = tyreBrand;
            brandOk = true;
        } else {
            System.out.println("Tyre brand is required.");
        }

        if (tyreType != null && !tyreType.isEmpty()) {
            type = tyreType;
            typeOk = true;
        } else {
            System.out.println("Tyre type is missing.");
        }

        if (size > 0) {
            sizeInInches = size;
            sizeOk = true;
        } else {
            System.out.println("Size must be greater than 0 inches.");
        }

        isForTwoWheeler = isBikeTyre;
        vehicleOk = true;

        if (grip != null && !grip.isEmpty()) {
            gripType = grip;
            gripOk = true;
        } else {
            System.out.println("Grip type is required.");
        }

        if (cost > 0) {
            price = cost;
            priceOk = true;
        } else {
            System.out.println("Price must be a positive value.");
        }

        if (brandOk && typeOk && sizeOk && vehicleOk && gripOk && priceOk) {
            isTyreRegistered = true;
        } else {
            System.out.println("Tyre registration failed.");
        }

        return isTyreRegistered;
    }

    public static void getTyreDetails() {
        System.out.println("Tyre Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Size: " + sizeInInches + " inches");
        System.out.println("For Two-Wheeler: " + isForTwoWheeler);
        System.out.println("Grip Type: " + gripType);
        System.out.println("Price: ₹" + price);
    }
}
