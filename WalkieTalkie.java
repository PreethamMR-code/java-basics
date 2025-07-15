class WalkieTalkie {
    static String brandName;
    static String modelName;
    static int rangeInMeters;
    static boolean isRechargeable;
    static int batteryLifeInHours;
    static String color;

    public static boolean registerWalkieTalkie(String brand, String model, int range, boolean rechargeable, int batteryHours, String clr) {
        boolean isDeviceRegistered = false;

        boolean brandOk = false;
        boolean modelOk = false;
        boolean rangeOk = false;
        boolean rechargeableOk = false;
        boolean batteryOk = false;
        boolean colorOk = false;

        if (brand != null && !brand.isEmpty()) {
            brandName = brand;
            brandOk = true;
        } else {
            System.out.println("Brand name is required.");
        }

        if (model != null && !model.isEmpty()) {
            modelName = model;
            modelOk = true;
        } else {
            System.out.println("Model name is missing.");
        }

        if (range > 0) {
            rangeInMeters = range;
            rangeOk = true;
        } else {
            System.out.println("Range must be greater than 0 meters.");
        }

        isRechargeable = rechargeable;
        rechargeableOk = true;

        if (batteryHours > 0) {
            batteryLifeInHours = batteryHours;
            batteryOk = true;
        } else {
            System.out.println("Battery life must be positive.");
        }

        if (clr != null && !clr.isEmpty()) {
            color = clr;
            colorOk = true;
        } else {
            System.out.println("Please provide a color.");
        }

        if (brandOk && modelOk && rangeOk && rechargeableOk && batteryOk && colorOk) {
            isDeviceRegistered = true;
        } else {
            System.out.println("Walkie Talkie registration failed.");
        }

        return isDeviceRegistered;
    }

    public static void getWalkieTalkieDetails() {
        System.out.println("Brand: " + brandName);
        System.out.println("Model: " + modelName);
        System.out.println("Range: " + rangeInMeters + " meters");
        System.out.println("Rechargeable: " + isRechargeable);
        System.out.println("Battery Life: " + batteryLifeInHours + " hours");
        System.out.println("Color: " + color);
    }
}
