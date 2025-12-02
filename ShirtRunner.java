class ShirtRunner {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt();
        shirt1.color = "Blue";
        shirt1.size = "M";
        shirt1.material = "Cotton";
        shirt1.price = 25.00;
        shirt1.brand = "Levi's";
        shirt1.getInfo();

        Shirt shirt2 = new Shirt("Red", "L", "Nike");
        shirt2.material = "Polyester";
        shirt2.price = 35.50;
        shirt2.getInfo();

        Shirt shirt3 = new Shirt("Linen", 45.00, "XL");
        shirt3.color = "White";
        shirt3.brand = "Zara";
        shirt3.getInfo();

        Shirt shirt4 = new Shirt("Adidas", "Black", 30.00);
        shirt4.size = "S";
        shirt4.material = "Spandex";
        shirt4.getInfo();

        Shirt shirt5 = new Shirt();
        shirt5.color = "Green";
        shirt5.size = "M";
        shirt5.material = "Organic Cotton";
        shirt5.price = 28.75;
        shirt5.brand = "H&M";
        shirt5.getInfo();
    }
}