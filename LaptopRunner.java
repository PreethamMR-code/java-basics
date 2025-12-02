class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.brand = "Dell";
        laptop1.model = "XPS 15";
        laptop1.screenSizeInches = 15.6;
        laptop1.ramGB = 16;
        laptop1.processor = "Intel i7";
        laptop1.getInfo();

        Laptop laptop2 = new Laptop("Apple", "MacBook Air", 13.3);
        laptop2.ramGB = 8;
        laptop2.processor = "M1";
        laptop2.getInfo();

        Laptop laptop3 = new Laptop(32, "Intel i9", "HP");
        laptop3.model = "Spectre x360";
        laptop3.screenSizeInches = 14.0;
        laptop3.getInfo();

        Laptop laptop4 = new Laptop("Legion 5", 16, "AMD Ryzen 7");
        laptop4.brand = "Lenovo";
        laptop4.screenSizeInches = 15.6;
        laptop4.getInfo();

        Laptop laptop5 = new Laptop();
        laptop5.brand = "Microsoft";
        laptop5.model = "Surface Laptop 5";
        laptop5.screenSizeInches = 13.5;
        laptop5.ramGB = 8;
        laptop5.processor = "Intel i5";
        laptop5.getInfo();
    }
}