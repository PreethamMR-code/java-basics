class Radio {
    static String brandName;
    static String modelName;
    static String tuningRange;
    static boolean hasBluetooth;
    static int soundPower;
    static String bodyColor;

    public static boolean registerRadio(String brand, String model, String range, boolean bluetooth, int power, String color) {
        boolean isRadioRegistered = false;

        boolean brandOk = false;
        boolean modelOk = false;
        boolean rangeOk = false;
        boolean bluetoothOk = false;
        boolean powerOk = false;
        boolean colorOk = false;

        if (brand != null && !brand.isEmpty()) {
            brandName = brand;
            brandOk = true;
        } else {
            System.out.println("Give a valid radio brand.");
        }

        if (model != null && !model.isEmpty()) {
            modelName = model;
            modelOk = true;
        } else {
            System.out.println("Model name can’t be empty.");
        }

        if (range != null && !range.isEmpty()) {
            tuningRange = range;
            rangeOk = true;
        } else {
            System.out.println("Tuning range is missing.");
        }

        hasBluetooth = bluetooth;
        bluetoothOk = true;

        if (power > 0) {
            soundPower = power;
            powerOk = true;
        } else {
            System.out.println("Speaker power must be above 0.");
        }

        if (color != null && !color.isEmpty()) {
            bodyColor = color;
            colorOk = true;
        } else {
            System.out.println("Color is required.");
        }

        if (brandOk && modelOk && rangeOk && bluetoothOk && powerOk && colorOk) {
            isRadioRegistered = true;
        } else {
            System.out.println("Radio setup failed. Try again.");
        }

        return isRadioRegistered;
    }

    public static void getRadioDetails() {
        System.out.println("Radio Brand: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Tuning Range: " + tuningRange);
        System.out.println("Bluetooth Support: " + hasBluetooth);
        System.out.println("Speaker Power: " + soundPower + "W");
        System.out.println("Color: " + bodyColor);
    }
}
