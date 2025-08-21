class Car {
    String make;
    String model;
    int year;
    String color;
    double price;
    String engineType;

    Car() {
        this("Toyota", "Corolla", 2020, "White", 20000, "Gasoline");
    }
    Car(String make) {
        this(make, "Corolla", 2020, "White", 20000, "Gasoline");
    }
    Car(String make, String model) {
        this(make, model, 2020, "White", 20000, "Gasoline");
    }
    Car(String make, String model, int year) {
        this(make, model, year, "White", 20000, "Gasoline");
    }
    Car(String make, String model, int year, String color) {
        this(make, model, year, color, 20000, "Gasoline");
    }
    Car(String make, String model, int year, String color, double price) {
        this(make, model, year, color, price, "Gasoline");
    }
    Car(String make, String model, int year, String color, double price, String engineType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.engineType = engineType;
    }
    void display() {
        System.out.println(make + " " + model + " " + year + " " + color + " $" + price + " " + engineType);
    }
}


