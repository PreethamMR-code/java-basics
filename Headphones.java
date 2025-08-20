class Headphones {
    String brand;
    String type;
    String connectionType;
    boolean hasNoiseCancellation;
    double price;

    Headphones() {
        System.out.println("Headphones constructor invoked");
    }

    Headphones(String brand, String type, String connectionType) {
        System.out.println("Headphones parameterized constructor (brand, type, connection) invoked");
        this.brand = brand;
        this.type = type;
        this.connectionType = connectionType;
    }

    Headphones(boolean hasNoiseCancellation, double price, String brand) {
        System.out.println("Headphones parameterized constructor (noise cancel, price, brand) invoked");
        this.hasNoiseCancellation = hasNoiseCancellation;
        this.price = price;
        this.brand = brand;
    }

    Headphones(String connectionType, double price, boolean hasNoiseCancellation) {
        System.out.println("Headphones parameterized constructor (connection, price, noise cancel) invoked");
        this.connectionType = connectionType;
        this.price = price;
        this.hasNoiseCancellation = hasNoiseCancellation;
    }

    public void getInfo() {
        System.out.println("\n--- Headphones Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Noise Cancellation: " + hasNoiseCancellation);
        System.out.println("Price: $" + price);
    }
}

