class Shirt {
    String color;
    String size;
    String material;
    double price;
    String brand;

    Shirt() {
        System.out.println("Shirt constructor invoked");
    }

    Shirt(String color, String size, String brand) {
        System.out.println("Shirt parameterized constructor (color, size, brand) invoked");
        this.color = color;
        this.size = size;
        this.brand = brand;
    }

    Shirt(String material, double price, String size) {
        System.out.println("Shirt parameterized constructor (material, price, size) invoked");
        this.material = material;
        this.price = price;
        this.size = size;
    }

    Shirt(String brand, String color, double price) {
        System.out.println("Shirt parameterized constructor (brand, color, price) invoked");
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void getInfo() {
        System.out.println("\n--- Shirt Details ---");
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
    }
}
