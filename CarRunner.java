class CarRunner {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
        Car c2 = new Car("Honda");
        c2.display();
        Car c3 = new Car("Ford", "Mustang");
        c3.display();
        Car c4 = new Car("Tesla", "Model S", 2023);
        c4.display();
        Car c5 = new Car("BMW", "X5", 2022, "Black");
        c5.display();
        Car c6 = new Car("Audi", "A4", 2021, "Blue", 35000);
        c6.display();
        Car c7 = new Car("Mercedes", "C-Class", 2020, "Red", 42000, "Diesel");
        c7.display();
    }
}