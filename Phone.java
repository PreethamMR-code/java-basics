class Phone {
    String brand;
    String model;
    String os;
    int ram;
    int storage;
    double price;

    Phone() {
        this("Samsung", "Galaxy S", "Android", 8, 128, 600);
    }
    Phone(String brand) {
        this(brand, "Galaxy S", "Android", 8, 128, 600);
    }
    Phone(String brand, String model) {
        this(brand, model, "Android", 8, 128, 600);
    }
    Phone(String brand, String model, String os) {
        this(brand, model, os, 8, 128, 600);
    }
    Phone(String brand, String model, String os, int ram) {
        this(brand, model, os, ram, 128, 600);
    }
    Phone(String brand, String model, String os, int ram, int storage) {
        this(brand, model, os, ram, storage, 600);
    }
    Phone(String brand, String model, String os, int ram, int storage, double price) {
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }
    void display() {
        System.out.println(brand + " " + model + " " + os + " " + ram + "GB " + storage + "GB $" + price);
    }
}


