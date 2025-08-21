class Laptop {
    String brand;
    String model;
    String processor;
    int ram;
    int storage;
    double price;

    Laptop() {
        this("Dell", "Inspiron", "Intel i5", 8, 512, 700.0);
    }
    Laptop(String brand) {
        this(brand, "Inspiron", "Intel i5", 8, 512, 700.0);
    }
    Laptop(String brand, String model) {
        this(brand, model, "Intel i5", 8, 512, 700.0);
    }
    Laptop(String brand, String model, String processor) {
        this(brand, model, processor, 8, 512, 700.0);
    }
    Laptop(String brand, String model, String processor, int ram) {
        this(brand, model, processor, ram, 512, 700.0);
    }
    Laptop(String brand, String model, String processor, int ram, int storage) {
        this(brand, model, processor, ram, storage, 700.0);
    }
    Laptop(String brand, String model, String processor, int ram, int storage, double price) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }
    void display() {
        System.out.println(brand + " " + model + " " + processor + " " + ram + "GB " + storage + "GB $" + price);
    }
}


