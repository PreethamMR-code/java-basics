class Speaker {
    String brand;
    String type;
    int wattage;
    boolean isBluetooth;
    String color;

    Speaker() {
        System.out.println("Speaker constructor invoked");
    }

    Speaker(String brand, String type, int wattage) {
        System.out.println("Speaker parameterized constructor (brand, type, wattage) invoked");
        this.brand = brand;
        this.type = type;
        this.wattage = wattage;
    }

    Speaker(boolean isBluetooth, String color, String brand) {
        System.out.println("Speaker parameterized constructor (bluetooth, color, brand) invoked");
        this.isBluetooth = isBluetooth;
        this.color = color;
        this.brand = brand;
    }

    Speaker(String type, String color, boolean isBluetooth) {
        System.out.println("Speaker parameterized constructor (type, color, bluetooth) invoked");
        this.type = type;
        this.color = color;
        this.isBluetooth = isBluetooth;
    }

    public void getInfo() {
        System.out.println("\n--- Speaker Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Wattage: " + wattage + "W");
        System.out.println("Is Bluetooth: " + isBluetooth);
        System.out.println("Color: " + color);
    }
}

