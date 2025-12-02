class Coffee {
    String type;
    String size;
    String temperature;
    boolean hasMilk;
    double price;

    Coffee() {
        System.out.println("Coffee constructor invoked");
    }

    Coffee(String type, String size, double price) {
        System.out.println("Coffee parameterized constructor (type, size, price) invoked");
        this.type = type;
        this.size = size;
        this.price = price;
    }

    Coffee(String temperature, boolean hasMilk, String type) {
        System.out.println("Coffee parameterized constructor (temperature, hasMilk, type) invoked");
        this.temperature = temperature;
        this.hasMilk = hasMilk;
        this.type = type;
    }

    Coffee(double price, String size, boolean hasMilk) {
        System.out.println("Coffee parameterized constructor (price, size, hasMilk) invoked");
        this.price = price;
        this.size = size;
        this.hasMilk = hasMilk;
    }

    public void getInfo() {
        System.out.println("\n--- Coffee Details ---");
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Temperature: " + temperature);
        System.out.println("Has Milk: " + hasMilk);
        System.out.println("Price: $" + price);
    }
}

