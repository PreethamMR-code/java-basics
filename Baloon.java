class Baloon {
    String color;
    String size;
    String material;
    String gasType;
    double price;
    String brand;

    Baloon() {
        this("Red", "Medium", "Rubber", "Air", 0.50, "Generic");
        System.out.println("Baloon: Default constructor invoked");
    }

    Baloon(String color) {
        this(color, "Medium", "Rubber", "Air", 0.50, "Generic");
        System.out.println("Baloon: 1-param constructor invoked");
    }

    Baloon(String color, String size) {
        this(color, size, "Rubber", "Air", 0.50, "Generic");
        System.out.println("Baloon: 2-param constructor invoked");
    }

    Baloon(String color, String size, String material) {
        this(color, size, material, "Air", 0.50, "Generic");
        System.out.println("Baloon: 3-param constructor invoked");
    }

    Baloon(String color, String size, String material, String gasType) {
        this(color, size, material, gasType, 0.50, "Generic");
        System.out.println("Baloon: 4-param constructor invoked");
    }

    Baloon(String color, String size, String material, String gasType, double price) {
        this(color, size, material, gasType, price, "Generic");
        System.out.println("Baloon: 5-param constructor invoked");
    }

    Baloon(String color, String size, String material, String gasType, double price, String brand) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.gasType = gasType;
        this.price = price;
        this.brand = brand;
        System.out.println("Baloon: 6-param constructor invoked");
    }

    public void display() {
        System.out.println("--- Baloon Details ---");
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Gas Type: " + gasType);
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
    }
}

