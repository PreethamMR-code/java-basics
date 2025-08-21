class LaptopRunner {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.display();
        Laptop l2 = new Laptop("HP");
        l2.display();
        Laptop l3 = new Laptop("Apple", "MacBook Air");
        l3.display();
        Laptop l4 = new Laptop("Lenovo", "ThinkPad", "Intel i7");
        l4.display();
        Laptop l5 = new Laptop("Asus", "VivoBook", "AMD Ryzen 5", 16);
        l5.display();
        Laptop l6 = new Laptop("Acer", "Swift", "Intel i3", 8, 256);
        l6.display();
        Laptop l7 = new Laptop("Microsoft", "Surface", "Intel i5", 16, 512, 1200);
        l7.display();
    }
}