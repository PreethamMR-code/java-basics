class Bicycle {
    String brand;
    String model;
    String type;
    int gearCount;
    double price;
    boolean hasBell;

    Bicycle() {
        this("Giant", "Escape 3", "Road", 21, 500.0, true);
    }
    Bicycle(String brand) {
        this(brand, "Escape 3", "Road", 21, 500.0, true);
    }
    Bicycle(String brand, String model) {
        this(brand, model, "Road", 21, 500.0, true);
    }
    Bicycle(String brand, String model, String type) {
        this(brand, model, type, 21, 500.0, true);
    }
    Bicycle(String brand, String model, String type, int gearCount) {
        this(brand, model, type, gearCount, 500.0, true);
    }
    Bicycle(String brand, String model, String type, int gearCount, double price) {
        this(brand, model, type, gearCount, price, true);
    }
    Bicycle(String brand, String model, String type, int gearCount, double price, boolean hasBell) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.gearCount = gearCount;
        this.price = price;
        this.hasBell = hasBell;
    }
    void display() {
        System.out.println(brand + " " + model + " " + type + " " + gearCount + " gears $" + price + " Bell: " + hasBell);
    }
}
