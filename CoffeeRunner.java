class CoffeeRunner {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();
        coffee1.type = "Latte";
        coffee1.size = "Medium";
        coffee1.temperature = "Hot";
        coffee1.hasMilk = true;
        coffee1.price = 4.50;
        coffee1.getInfo();

        Coffee coffee2 = new Coffee("Espresso", "Small", 3.00);
        coffee2.temperature = "Hot";
        coffee2.hasMilk = false;
        coffee2.getInfo();

        Coffee coffee3 = new Coffee("Iced", true, "Cappuccino");
        coffee3.size = "Large";
        coffee3.price = 5.75;
        coffee3.getInfo();

        Coffee coffee4 = new Coffee(4.00, "Medium", false);
        coffee4.type = "Americano";
        coffee4.temperature = "Hot";
        coffee4.getInfo();

        Coffee coffee5 = new Coffee();
        coffee5.type = "Mocha";
        coffee5.size = "Large";
        coffee5.temperature = "Hot";
        coffee5.hasMilk = true;
        coffee5.price = 5.25;
        coffee5.getInfo();
    }
}