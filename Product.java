class Product {
    String productName;
    double price;
    String brand;

    Product() {
        this.productName = "Smartphone X";
        this.price = 599.99;
        this.brand = "TechCo";
    }

    void getProductInfo() {
        System.out.println("-----Product Details------");
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
    }
}

